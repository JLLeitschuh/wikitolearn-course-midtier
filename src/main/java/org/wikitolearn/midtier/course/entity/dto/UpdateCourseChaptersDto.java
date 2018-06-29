package org.wikitolearn.midtier.course.entity.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_DEFAULT)
public class UpdateCourseChaptersDto {
  
  private String title;
  private String language;
  private List<ChapterInUpdateCourseChapters> chapters;
  
  @Data
  @NoArgsConstructor
  @JsonIgnoreProperties(ignoreUnknown = true)
  @JsonInclude(Include.NON_DEFAULT)
  public static final class ChapterInUpdateCourseChapters {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("_version")
    private int version;
  }
}
