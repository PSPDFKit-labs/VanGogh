Releasing
========

 1. Change the version in `gradle.properties` to a non-SNAPSHOT version.
 2. Update the `CHANGELOG.md` for the upcoming release.
 3. Update the `README.md` with the new version dependencies.
 4. `git commit -am "Prepare version x.y.z for release"` (where x.y.z is the new version)
 5. `git tag -a x.y.z -m "Version x.y.z"` (where x.y.z is the new version)
 6. `./gradlew clean uploadArchives`
 7. Update the `gradle.properties` to the next SNAPSHOT version.
 8. `git commit -am "Prepare next development version"`
 9. `git push && git push --tags`
 10. Visit [Sonatype Nexus](https://oss.sonatype.org/) and promote the artifact:
    * Log-in (credentials are in 'Nexus - VanGogh' entry in 1Password PSPDFKit Developers vault
    * Go to `Staging Repositories` and find the latest VanGogh repository in the list
    * Select it and press `Close` in the menu
    * Once the closing process is done (10-15 mins), select the same thing and press `Promote`
    * Once that is done (again 10-15 mins), select it one more time and press `Release`