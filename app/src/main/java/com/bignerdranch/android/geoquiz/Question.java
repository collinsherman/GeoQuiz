package com.bignerdranch.android.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsCheater;

    public Question(int textResID, boolean answerTrue) {
        mTextResId = textResID;
        mAnswerTrue = answerTrue;
        mIsCheater = false;
    }

    public void isCheater() { mIsCheater = true; }

    public boolean getCheater() { return mIsCheater; }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
