package c;

import ES.n;
import Rc.w6;
import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Dsr implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f43406n = new Dsr();
    private static final w6.j rl = w6.j.n("t", InneractiveMediationDefs.GENDER_FEMALE, CmcdData.STREAMING_FORMAT_SS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // c.vd
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ES.n n(Rc.w6 w6Var, float f3) {
        n.j jVar = n.j.CENTER;
        w6Var.Uo();
        n.j jVar2 = jVar;
        String strM = null;
        String strM2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fM7 = 0.0f;
        float fM72 = 0.0f;
        float fM73 = 0.0f;
        float fM74 = 0.0f;
        int iP5 = 0;
        int iNr = 0;
        int iNr2 = 0;
        boolean zU = true;
        while (w6Var.jB()) {
            switch (w6Var.Mx(rl)) {
                case 0:
                    strM = w6Var.M();
                    break;
                case 1:
                    strM2 = w6Var.M();
                    break;
                case 2:
                    fM7 = (float) w6Var.M7();
                    break;
                case 3:
                    int iP52 = w6Var.p5();
                    jVar2 = n.j.CENTER;
                    if (iP52 <= jVar2.ordinal() && iP52 >= 0) {
                        jVar2 = n.j.values()[iP52];
                    }
                    break;
                case 4:
                    iP5 = w6Var.p5();
                    break;
                case 5:
                    fM72 = (float) w6Var.M7();
                    break;
                case 6:
                    fM73 = (float) w6Var.M7();
                    break;
                case 7:
                    iNr = l3D.nr(w6Var);
                    break;
                case 8:
                    iNr2 = l3D.nr(w6Var);
                    break;
                case 9:
                    fM74 = (float) w6Var.M7();
                    break;
                case 10:
                    zU = w6Var.U();
                    break;
                case 11:
                    w6Var.rl();
                    PointF pointF3 = new PointF(((float) w6Var.M7()) * f3, ((float) w6Var.M7()) * f3);
                    w6Var.Z();
                    pointF = pointF3;
                    break;
                case 12:
                    w6Var.rl();
                    PointF pointF4 = new PointF(((float) w6Var.M7()) * f3, ((float) w6Var.M7()) * f3);
                    w6Var.Z();
                    pointF2 = pointF4;
                    break;
                default:
                    w6Var.fcU();
                    w6Var.n1();
                    break;
            }
        }
        w6Var.T();
        return new ES.n(strM, strM2, fM7, jVar2, iP5, fM72, fM73, iNr, iNr2, fM74, zU, pointF, pointF2);
    }

    private Dsr() {
    }
}
