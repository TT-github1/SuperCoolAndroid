package com.tthappy.supercoolandroid.ui.jetpack.score;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/20 18:58
 * Update Date:
 * Modified By:
 * Description:
 */
public class ScoreViewModel extends ViewModel {
    private MutableLiveData<Integer> scoreTeamA;
    private MutableLiveData<Integer> scoreTeamB;

    public MutableLiveData<Integer> getScoreTeamA() {
        if(null == scoreTeamA){
            scoreTeamA = new MutableLiveData<>();
            //在这里做网络请求等
            scoreTeamA.setValue(0);
        }
        return scoreTeamA;
    }

    public MutableLiveData<Integer> getScoreTeamB() {
        if(null == scoreTeamB){
            scoreTeamB = new MutableLiveData<>();
            scoreTeamB.setValue(0);
        }
        return scoreTeamB;
    }

    public void addTeamA(int score){
        scoreTeamA.setValue(scoreTeamA.getValue() + score);
    }

    public void addTeamB(int score){
        scoreTeamB.setValue(scoreTeamB.getValue() + score);
    }

    public void reset(){
        scoreTeamA.setValue(0);
        scoreTeamB.setValue(0);
    }
}
