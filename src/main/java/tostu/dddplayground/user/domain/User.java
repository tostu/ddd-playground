package tostu.dddplayground.user.domain;

public class User {
    UserId id;
    UserName name;

    public record UserId(Long value){};
    public record UserName(String value){};
}
