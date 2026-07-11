package androidx.work;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class InputMergerFactory {
    public abstract InputMerger n(String str);

    public static InputMergerFactory t() {
        return new InputMergerFactory() { // from class: androidx.work.InputMergerFactory.1
            @Override // androidx.work.InputMergerFactory
            public InputMerger n(String str) {
                return null;
            }
        };
    }

    public final InputMerger rl(String str) {
        InputMerger inputMergerN = n(str);
        if (inputMergerN == null) {
            return InputMerger.n(str);
        }
        return inputMergerN;
    }
}
