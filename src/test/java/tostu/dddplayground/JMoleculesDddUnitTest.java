package tostu.dddplayground;

import com.tngtech.archunit.junit.*;
import com.tngtech.archunit.lang.*;

import org.jmolecules.archunit.*;

@AnalyzeClasses(packages = "tostu.dddplayground")
class JMoleculesDddUnitTest {
    @ArchTest
    ArchRule dddRules = JMoleculesDddRules.all(); // (2)

    @ArchTest
    ArchRule onion = JMoleculesArchitectureRules.ensureLayering(); // (2)
}
