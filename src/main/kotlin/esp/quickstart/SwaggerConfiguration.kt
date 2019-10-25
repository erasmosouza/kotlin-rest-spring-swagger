package esp.quickstart

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.service.Contact
import springfox.documentation.service.VendorExtension
import java.util.ArrayList

@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    open fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo())

    fun apiInfo(): ApiInfo {

        return ApiInfo(
            "Minha API Rest",
            "Descricao da minha api",
            "V0.3",
            "www.erasmopinheiro.com",
            Contact("Erasmo Pinheiro", "www.erasmopinheiro.com", "erasmo@erasmopinheiro.com"),
            "Licence of API",
            "www.erasmopinheiro.com/licence",
            ArrayList<VendorExtension<*>>()
        )
    }
}