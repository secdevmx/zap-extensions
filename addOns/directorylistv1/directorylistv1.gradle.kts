import org.zaproxy.gradle.addon.AddOnStatus

version = "4"
description = "List of directory names to be used with Forced Browse or Fuzzer add-on."

zapAddOn {
    addOnName.set("Directory List v1.0")
    addOnStatus.set(AddOnStatus.RELEASE)
    zapVersion.set("2.5.0")

    manifest {
        author.set("ZAP Dev Team")
        url.set("https://www.owasp.org/index.php/DirBuster")

        helpSet {
            baseName.set("help%LC%.helpset")
            localeToken.set("%LC%")
        }
    }
}
