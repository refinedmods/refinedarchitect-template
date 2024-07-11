# Refined Architect template [![Build Status](https://github.com/refinedmods/refinedarchitect-template/actions/workflows/build.yml/badge.svg?branch=develop)](https://github.com/refinedmods/refinedarchitect-template/actions/workflows/build.yml) [![Discord](https://img.shields.io/discord/342942776494653441)](https://discordapp.com/invite/VYzsydb) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE.md)

## About

A template utilizing [Refined Architect](https://github.com/refinedmods/refinedarchitect).

### How to use this template

- Clone the repository.
- Update `README.md`:
  - Remove this explanation.
  - Update the title.
  - Update the build badge URL.
- Update [Refined Architect](https://github.com/refinedmods/refinedarchitect) when necessary:
  - Search and replace the version number in the project.
  - This should change the version in `settings.gradle.kts` and the GitHub actions.
- Update the URLs in `.github/CONTRIBUTING.md`.
- Update the project name in `.github/workflows/publish-release.yml`.
- Update the branch policies for `develop`:
  - Require a pull request before merging.
  - Dismiss stale pull request approvals when new commits are pushed.
  - Require status checks to pass before merging:
    - `validate-commit-messages`
    - `validate-changelog`
    - `validate-branch-name`
    - `build`
  - Require branches to be up to date before merging.
  - Require conversation resolution before merging.
  - Do not allow bypassing the above settings.
- Set the tags on the GitHub repository.
- Set some GitHub repository settings:
  - Only allow issues.
  - Preserve this repository.
  - Only allow merge commits.
  - Allow auto-merge.
  - Automatically delete head branches.
- Ensure that the workflows can create PRs and push to the repository:
  - Under [Fine-granted personal access tokens](https://github.com/settings/tokens?type=beta), change the repository access for "Gitflow push token".
  - Under [GitHub Actions secrets](https://github.com/organizations/refinedmods/settings/secrets/actions/GITFLOW_PUSH_TOKEN), change the repository access for the `GITFLOW_PUSH_TOKEN` secret.
- Create a `main` branch from `develop` as soon as you are ready. Apply the same branch policies from `develop`.
- Start a "Draft release" workflow to start the release process.

### Optional: Set-up Crowdin

- Create a project on Crowdin.
  - Enable the localization status badge. 
- Copy the `examples/crowdin.yml` file to the root directory as `crowdin.yml`.
  - Configure the project identifier and source translation file location. 
- Add the Crowdin badge to `README.md` from `examples/crowdin-badge.md`. 
- On Crowdin, configure the GitHub integration:
  - Choose "Source and translation files mode".
  - Select the repository and the `develop` branch.
  - Service Branch Name should be `crowdin-translations`.
  - Configure the Sync Schedule to 24 hours.

### Optional: Set-up SonarQube

- Create a project on SonarCloud.
- For Analysis Method, disable Automatic Analysis.
- In `build.gradle.kts`, uncomment the `sonarQube` function.
- Add SonarQube build badges to `README.md` from `examples/sonarqube-badges.md`.

### Optional: Add a webhook for Discord announcements

- Add a repository webhook for Discord announcements.
  - Content type: `application/json`.
- Events:
  - Branch or tag creation
  - Forks
  - Issue comments
  - Issues
  - Milestones
  - Pull requests
  - Pull request reviews
  - Pushes
  - Releases
  - Stars
  - Watches

### Optional: Set-up CurseForge and Modrinth publishing

- Create projects on CurseForge and Modrinth.
- Configure publishing in the `build.gradle.kts` file of the NeoForge and Fabric subprojects.
- Add CurseForge and Modrinth download count badges to `README.md` from `examples/curseforge-modrinth-badges.md`.

## Links

- [GitHub](https://github.com/refinedmods/refinedarchitect-template)
    - [Releases](https://github.com/refinedmods/refinedarchitect-template/releases)
    - [Packages](https://github.com/refinedmods/refinedarchitect-template/packages)
    - [Issues](https://github.com/refinedmods/refinedarchitect-template/issues)
    - [Refined Mods on GitHub](https://github.com/refinedmods)
- [Discord](https://discordapp.com/invite/VYzsydb)
- [Twitter](https://twitter.com/refinedmods)
- [Mastodon](https://anvil.social/@refinedmods)

## Building

Clone the repository and import the Gradle project.

## Contributing

See [CONTRIBUTING.md](.github/CONTRIBUTING.md).

## Support

See [SUPPORT.md](.github/SUPPORT.md).

## Changelog

See [CHANGELOG.md](CHANGELOG.md).
