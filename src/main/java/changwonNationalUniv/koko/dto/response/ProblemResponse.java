package changwonNationalUniv.koko.dto.response;

import changwonNationalUniv.koko.entity.Problem;
import changwonNationalUniv.koko.enums.ClearState;
import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProblemResponse {

    private Long id;

    private Integer level;

    private String korean;

    private String english;

    private Integer clearCnt;

    private Integer challengeCnt;

    private ClearState clearState;

    private String koPronunciation;

    private String enPronunciation;

    private Float exp;

    public ProblemResponse(Long id, String korean, Integer challengeCnt, Integer clearCnt, ClearState clearState) {
        this.id = id;
        this.korean = korean;
        this.clearCnt = clearCnt;
        this.challengeCnt = challengeCnt;
        this.clearState = clearState;
    }

    public static ProblemResponse of(Problem problem) {

        return ProblemResponse
                .builder()
                .id(problem.getId())
                .level(problem.getLevel())
                .korean(problem.getKorean())
                .english(problem.getEnglish())
                .clearCnt(problem.getClearCnt())
                .challengeCnt(problem.getChallengeCnt())
                .koPronunciation(problem.getKoPronunciation())
                .enPronunciation(problem.getEnPronunciation())
                .exp(problem.getExp())
                .build();
    }

}
