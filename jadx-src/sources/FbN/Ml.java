package FbN;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml extends w6 {
    public Ml(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Uo(context, attributeSet);
    }

    protected void Uo(Context context, AttributeSet attributeSet) {
        if (T5.n.nr()) {
            T5.n.n("GenericDraweeView#inflateHierarchy");
        }
        Jff.n nVarNr = Jff.w6.nr(context, attributeSet);
        setAspectRatio(nVarNr.J2());
        setHierarchy(nVarNr.n());
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }
}
