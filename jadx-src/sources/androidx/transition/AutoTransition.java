package androidx.transition;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AutoTransition extends TransitionSet {
    private void HV() {
        qm(1);
        C(new Fade(2)).C(new ChangeBounds()).C(new Fade(1));
    }

    public AutoTransition() {
        HV();
    }
}
