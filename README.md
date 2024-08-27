# spring-boot-github-actions-demo
Demo project spring boot with github actions

# Follow below steps:

- Step 01: Create the spring boot project with one GET api.

- Step 02: Create the repo in git hub.

- Step 03: Push the changes to the remote repo.

- Step 04: Create the Git Hub Actions Flow with Java with Maven.

- Step 05: Merge these changes to main branch then verify the build status in work flow.

- Step 06: Pull these changes to local.

- Step 07: Add the docker configuration in maven.yml file as well create the docker file.
    - 7.1: https://github.com/marketplace/actions/docker-build-push-action
    - 7.2: Login to your docker hub, create the repo then add that value for image
    - 7.3: Add docker.io for registry
    - 7.4: Create the docker file and add neccessary steps
    - 7.5: Add the Docker secrets in the git hub secretes.
    - 7.6: Push these changes to git hub then verify the git hub actions work flow

 - Step 08: Pull that image created in docker hub and run in you local
    - docker pull docker-id/image-name
    - docker images
    - docker run -p 8080:8080 docker-id/image-name
