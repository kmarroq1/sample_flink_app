Tutorials

Flink Tutorial

- [ ] filter out any name containing an `e`.
- [ ] add two fields to the dto:
    - [ ]     - `uuid` (unique identifier). make it whatever type you want.
    - [ ]     - `price` - make it a `Double` (not to be confused with the primitive type `double`)
- [ ] map the `SampleDto.favoriteNumber` to `SampleDto.price`.
    - [ ]     - do not assign the price during construction of the object.
- [ ] assign a uuid to each field in each object passed through the stream by using a stream operator. 
    - [ ] - do not assign the uuid during construction of the object.
- [ ] - if an object such that `SampleDto.favoriteNumber` is divisible by 2:
- [ ] - clone that SampleDto. the operator should emit the original SampleDto and the cloned SampleDto.
    - [ ]     - on the clone, assign `price` by dividing the original's `price` by 2.
    - [ ]     - on the clone, assign it a new uuid.
    - [ ]     - on the clone, append "_clone" to its `name`.
    - [ ]     - on the clone, set the favorite number equal to the original dto's favorite number.
- [ ] - send any price that is divisible by 2 to a different stream via side output.
- [ ] - on the side output stream, subtract 30 from the price, then print any events with a price > 0.

Mapstruct tutorial

- [ ] add/implement mapstruct to the sample_flink_program project.
- [ ] create a new class (in a new file) called ExampleDto with fields String "name", String "coolerNumber", Integer "soldPrice"
- [ ] 		map SampleDto.name => ExampleDto.name implicitly (without using an annotation).
- [ ] 		map SampleDto.favoriteNumber => ExampleDto.coolerNumber (this should be from Integer to String).
- [ ] 		map SampleDto.price - 3 => ExampleDto.soldPrice  because the ExampleDto knows how to haggle.
- [ ] 		ensure mapstruct does not show any warnings.
- [ ] 		BONUS : use @AfterMapping to add 6 to the newly made ExampleDto's sold price. Turns out it had a debt to repay.
- [ ] 		apply the mapper inside a Flink operator.
- [ ] 		sink to standard output (.print()).
- [ ] 		push all your changes to a new branch in the repository with a reasonable name.

RESOURCES
mapstruct: https://mapstruct.org/

I recommend looking at the develop branch for using our files as example. Navigate to this directory (java is painfully verbose with directory structure sometimes....)
cnn-dataviz-pipelines/src/pipelines/routers/marketdata/src/main/java/com/cnn/dataviz/flink/router/marketdata
once there, the mappers directory has our use cases of Mapstruct. BondMapper.java, CryptoMapper.java are two examples of simpler implementations. IndexFutureMapper.java has how to map multiple objects into one.
