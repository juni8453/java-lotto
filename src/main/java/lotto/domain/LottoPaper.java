package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoPaper {

    private final List<Lotto> lottos;

    public LottoPaper(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public int getLottoSize() {
        return lottos.size();
    }

    public String showLottoPaper() {
        StringBuilder sb = new StringBuilder();

        for (Lotto lotto : lottos) {
            sb.append(lotto.showLottoNumbers()).append("\r\n");
        }

        return sb.toString();
    }

    public List<Integer> judgeWinning(List<Integer> winningNumbers) {
        List<Integer> correctCounts = new ArrayList<>();

        for (Lotto lotto : lottos) {
            correctCounts.add(lotto.getCorrectNumberCount(winningNumbers));
        }

        return correctCounts;
    }
}
