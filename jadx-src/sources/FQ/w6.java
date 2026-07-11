package FQ;

import com.facebook.ads.AdExperienceType;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 extends n {
    @Override // FQ.n
    AdExperienceType n() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }

    public w6(MediationAdLoadCallback mediationAdLoadCallback, I28 i28) {
        super(mediationAdLoadCallback, i28);
    }
}
