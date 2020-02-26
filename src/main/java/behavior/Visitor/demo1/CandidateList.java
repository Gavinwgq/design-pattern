package behavior.Visitor.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/2/26 20:31
 */
public class CandidateList {
    private List<Candidate> candidateList = Lists.newArrayList();
    public void addCandidate(Candidate candidate){
        candidateList.add(candidate);
    }

    public void accept(Award award){
        for (Candidate candidate : candidateList) {
            candidate.accept(award);
        }
    }
}
