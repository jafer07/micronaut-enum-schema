package example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.QueryValue;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;

@Controller("/example")
public class ExampleController {

    @Get
    public HttpResponse<String> fooBar(
            @Parameter(
                    description = "Subset of supported enum values",
                    schema = @Schema(
                            type = "string",
                            allowableValues = {
                                    "TYPE1", "TYPE2"
                            }
                    )
            )
            @QueryValue("e") FooBar.Type fooBar
    ) {
        return HttpResponse.ok("foobar: " + fooBar);
    }
}