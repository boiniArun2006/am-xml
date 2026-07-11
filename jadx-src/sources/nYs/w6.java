package nYs;

import com.alightcreative.monorepo.settings.LandingTab;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LandingTab.values().length];
            try {
                iArr[LandingTab.PROJECTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean n(nYs.j jVar) {
        LandingTab landingTabR = jVar != null ? jVar.r() : null;
        return (landingTabR == null ? -1 : j.$EnumSwitchMapping$0[landingTabR.ordinal()]) == 1;
    }
}
