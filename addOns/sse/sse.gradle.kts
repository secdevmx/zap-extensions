version = "10"
description = "Allows you to view Server-Sent Events (SSE) communication."

zapAddOn {
    addOnName.set("Server-Sent Events")
    zapVersion.set("2.5.0")

    manifest {
        author.set("ZAP Dev Team")
    }
}

dependencies {
    testImplementation(project(":testutils"))
}
