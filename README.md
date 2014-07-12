Wicket Sample
=============

This project contains a simple application that uses [Apache Wicket](http://wicket.apache.org/).

## Running in Eclipse

1. Download and install [Eclipse with the WebSphere Developer Tools](https://developer.ibm.com/wasdev/downloads/liberty-profile-using-eclipse/).
2. Create a new Liberty Profile Server. See [step 3](https://developer.ibm.com/wasdev/downloads/liberty-profile-using-eclipse/) for details.
3. Clone this repository.
4. Import the sample into Eclipse using *File -> Import -> Maven -> Existing Maven Projects* option.
5. Deploy the sample into Liberty server. Right click on the *wicket* sample and select *Run As -> Run on Server* option. Find and select the Liberty profile server and press *Finish*. 
6. Go to: [http://localhost:9080/wicket](http://localhost:9080/wicket)

## Building 

The sample can be build using [Apache Maven](http://maven.apache.org/).

```bash
$ mvn install
```

# Notice

© Copyright IBM Corporation 2014.

# License

```text
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````
