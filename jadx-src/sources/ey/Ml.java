package ey;

import LQ.j;
import as.eO;
import as.qz;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Q4.Ml J2(Format format) {
        return new Q4.Ml(format.encoderDelay, format.encoderPadding, new Q4.j(qz.rl(format.channelCount), eO.nr(format.sampleRate), Q4.I28.n(Q4.w6.f7912n.n(format.pcmEncoding)), format.pcmEncoding == 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(I28 i28, uPp.j jVar) {
        i28.n(new j.n(jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(I28 i28, as.n nVar) {
        i28.n(new j.w6(nVar));
    }
}
