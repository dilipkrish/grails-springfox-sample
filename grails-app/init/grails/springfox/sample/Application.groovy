package grails.springfox.sample

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import springfox.documentation.grails.GrailsConfiguration
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@Import(GrailsConfiguration.class)
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Bean
     Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .ignoredParameterTypes(MetaClass)
    }
}