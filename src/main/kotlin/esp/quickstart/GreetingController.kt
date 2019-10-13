package esp.quickstart

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    var count = AtomicLong();

    @GetMapping("/greeting")
    fun hello(@RequestParam("name", defaultValue = "World") name: String) =
        Greeting(count.incrementAndGet(), "Hello, $name")
}