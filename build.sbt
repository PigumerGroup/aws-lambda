import jp.pigumer.sbt.cloud.aws.cloudformation._

val BucketName = sys.env.get("BUCKET_NAME")

lazy val root = (project in file(".")).
  enablePlugins(CloudformationPlugin).
  settings(
    name := "aws-lambda-example",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.6",
    awscfSettings := AwscfSettings(
      region = "ap-northeast-1",
      bucketName = BucketName,
      projectName = "lambda-example",
      templates = Some(file("cloudformation")),
    ),
    awscfStacks := Stacks(
      Alias("test-lambda") → CloudformationStack(
        stackName = "test-lambda",
        template = "lambda.yaml",
        capabilities = Seq("CAPABILITY_IAM")
      )
    )
  )
