package tostu.dddplayground.core;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import tostu.dddplayground.user.adapter.primary.rest.dto.UserDto;

import java.util.concurrent.CompletableFuture;

@Getter
public class QueryEvent extends ApplicationEvent {

    private final CompletableFuture<UserDto> result = new CompletableFuture<>();

    public QueryEvent(Object source) {
        super(source);
    }
}
