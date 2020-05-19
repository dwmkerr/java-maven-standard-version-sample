# Java Maven Standard Version Sample

This simple module demos how to use Conventional Commits, Git Hooks to enforce Conventional Commits and Semantic Versioning in a Java project built with Maven.

This is the companion project to the article [Supercharge your Java Projects with Conventional Commits, Semantic Versioning and Semantic Releases](https://dwmkerr.com/conventional-commits-and-semantic-versioning-for-java/).

Also, if you want to see what the code looks like _after_ we've added the changelog etc, check the [`release`](https://github.com/dwmkerr/java-maven-standard-version-sample/tree/release) branch.

## Developer Guide

Make sure you have setup your local Git Hooks:

```sh
git config core.hooksPath .githooks
```

This will make sure your commit messages follow the [Conventional Commits Specification](https://www.conventionalcommits.org/en/v1.0.0/).

Here's some handly commands:

| Command | Usage |
|---------|-------|
| `./mvnw -B verify` | Run the tests. |
| `./mvnw -B package` | Run the builds. |

## Semantic Versioning

This project uses `standard-release` to update the version in the `pom.xml` file from the changes in the history and to create the `CHANGELOG.md` file.

To setup semantic versioning and create the baseline changelog, run:

```sh
npx dwmkerr/standard-version --first-release --packageFiles pom.xml --bumpFiles pom.xml
```

Now any time you want to cut a new release, run:

```sh
npx dwmkerr/standard-version --packageFiles pom.xml --bumpFiles pom.xml
```

This will:

- Update the `CHANGELOG.md`
- Update the version number based on the commit history
- Create a git tag with the new version number

Finally, just push the tag to trigger a deployment of the new version:

```sh
git push --follow-tags
```
