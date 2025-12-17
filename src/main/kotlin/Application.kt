package com.example

import com.example.model.Priority
import com.example.model.Task
import io.ktor.server.application.*
import io.ktor.server.http.content.staticResources
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import io.ktor.server.thymeleaf.Thymeleaf
import io.ktor.server.thymeleaf.ThymeleafContent
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureTemplating()
    configureRouting()
//    install(Thymeleaf) {
//        setTemplateResolver(ClassLoaderTemplateResolver().apply {
//            prefix = "templates/thymeleaf/"
//            suffix = ".html"
//            characterEncoding = "utf-8"
//        })
//    }
//    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }
//        // Static plugin. Try to access `/static/index.html`
//        staticResources("/static", "static")
//
//
//        get("/html-thymeleaf") {
//            call.respond(ThymeleafContent(template = "index", model = mapOf("user" to ThymeleafUser(1, "user1"))))
//        }
//        get("/tasks") {
//            val tasks = listOf(
//                Task("cleaning", "Clean the house", Priority.Low),
//                Task("gardening", "Mow the lawn", Priority.Medium),
//                Task("shopping", "Buy the groceries", Priority.High),
//                Task("painting", "Paint the fence", Priority.Medium)
//            )
//            call.respond(ThymeleafContent(template = "all-tasks", model = mapOf("tasks" to tasks)))
//        }
//    }
}
