package sample_flink_program;

import java.util.Arrays;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class App {

  public static void main(String[] args) throws Exception {
    var user1 = SampleDto.builder().name("alpha").favoriteNumber(56).build();
    var user2 = SampleDto.builder().name("beta").favoriteNumber(10).build();
    var user3 = SampleDto.builder().name("gamma").favoriteNumber(0).build();
    var users = Arrays.asList(user1, user2, user3);

    StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
    DataStreamSource<SampleDto> source = env.fromCollection(users);
    source.filter(event -> event.getName().endsWith("a")).print();

    env.execute();
  }
}
