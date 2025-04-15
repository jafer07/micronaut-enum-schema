package example;

import io.swagger.v3.oas.annotations.media.Schema;

public class FooBar {
    @Schema(name = "FooBarType")
    public enum Type {
        TYPE1,
        TYPE2,
        TYPE3,
        TYPE4,
        TYPE5
    }
}
