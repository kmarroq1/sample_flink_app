package sample_flink_program;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleDto {
  private String name;
  private Integer favoriteNumber;
}
