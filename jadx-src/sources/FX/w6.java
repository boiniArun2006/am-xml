package FX;

import FX.Ml;
import com.alightcreative.account.RankingProgram;
import com.alightcreative.account.SocialsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {
    public static final n n(RankingProgram rankingProgram) {
        String strRl;
        String youtube;
        String instagram;
        String tiktok;
        Intrinsics.checkNotNullParameter(rankingProgram, "<this>");
        ArrayList arrayList = new ArrayList();
        SocialsData socials = rankingProgram.getSocials();
        if (socials != null && (tiktok = socials.getTiktok()) != null) {
            if (StringsKt.isBlank(tiktok)) {
                tiktok = null;
            }
            if (tiktok != null) {
                arrayList.add(new Ml.n(tiktok));
            }
        }
        SocialsData socials2 = rankingProgram.getSocials();
        if (socials2 != null && (instagram = socials2.getInstagram()) != null) {
            if (StringsKt.isBlank(instagram)) {
                instagram = null;
            }
            if (instagram != null) {
                arrayList.add(new Ml.j(instagram));
            }
        }
        SocialsData socials3 = rankingProgram.getSocials();
        if (socials3 != null && (youtube = socials3.getYoutube()) != null) {
            if (StringsKt.isBlank(youtube)) {
                youtube = null;
            }
            if (youtube != null) {
                arrayList.add(new Ml.w6(youtube));
            }
        }
        Ml ml = (Ml) CollectionsKt.firstOrNull((List) arrayList);
        if (ml == null || (strRl = ml.rl()) == null) {
            return null;
        }
        return new n(Intrinsics.areEqual(rankingProgram.getStatus(), "accepted"), Intrinsics.areEqual(rankingProgram.getStatus(), "blacklisted"), new j(strRl, rankingProgram.getDownloads(), arrayList), rankingProgram.getRank());
    }
}
