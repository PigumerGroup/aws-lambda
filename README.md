# Deploy

```
$ BUCKET_NAME=<YOUR BUCKET NAME> sbt
sbt> awscfUplodaTemplates
sbt> awscfCreateStack test-lambda
```

# Update

```
$ BUCKET_NAME=<YOUR BUCKET NAME> sbt
sbt> awscfUplodaTemplates
sbt> awscfUpdateStack test-lambda
```

# Undeploy

```
$ BUCKET_NAME=<YOUR BUCKET NAME> sbt
sbt> awscfDeleteStack test-lambda
```