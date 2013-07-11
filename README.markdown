# Steps to reproduce:

1. in app1 directory, sbt publish-local
2. in app2 directory, sbt clean compile
3. in app2 directory, sbt clean compile again

The second invocation of clean compile in app2 fails saying testing:foo:1.0-SNAPSHOT can't be downloaded.

testing:foo is a sub project in app1.  It only works if testing:foo is a sub project.  The primary difference here is that in the SBT cache ivydata properties file for foo, the resolver must be "inter-project", not "sbt-chain".  I've got no idea what that means, but I discovered that from comparing the cache of the Play dependencies with the dependencies of this project when I was trying to reproduce the issue.
