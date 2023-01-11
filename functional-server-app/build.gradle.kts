plugins {
    id("Sockets.java-application-conventions")
}

dependencies {
    implementation(project(":functional-server-library"))
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
}

application {
    // Define the main class for the application.
    mainClass.set("app.App")
}
