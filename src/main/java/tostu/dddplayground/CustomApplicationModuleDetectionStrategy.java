package tostu.dddplayground;

import org.springframework.modulith.ApplicationModule;
import org.springframework.modulith.core.ApplicationModuleDetectionStrategy;
import org.springframework.modulith.core.JavaPackage;

import java.util.regex.Pattern;
import java.util.stream.Stream;

class CustomApplicationModuleDetectionStrategy implements ApplicationModuleDetectionStrategy {

    private static final String PACKAGE_PATTERN = "^adapter\\.primary\\.internal(\\..*)?$";  // Matches any package in the 'adapter.primary.internal' hierarchy

    @Override
    public Stream<JavaPackage> getModuleBasePackages(JavaPackage basePackage) {
        // Recursively scan all packages under the base package

        Stream<JavaPackage> subPackagesAnnotatedWith = basePackage.getSubPackagesAnnotatedWith(ApplicationModule.class);

        Stream<JavaPackage> subPackagesMatchingPattern = scanPackages(basePackage)
                .filter(pkg -> matchesPattern(pkg.getName()));

        return Stream.concat(subPackagesAnnotatedWith, subPackagesMatchingPattern);
    }

    // Method to recursively scan all packages under the given package
    private Stream<JavaPackage> scanPackages(JavaPackage basePackage) {
        return Stream.concat(Stream.of(basePackage), basePackage.getDirectSubPackages().stream().flatMap(this::scanPackages));
    }

    // Method to check if package name matches the defined pattern
    private boolean matchesPattern(String packageName) {
        return Pattern.matches(PACKAGE_PATTERN, packageName);
    }
}
