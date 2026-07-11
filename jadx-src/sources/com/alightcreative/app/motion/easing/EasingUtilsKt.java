package com.alightcreative.app.motion.easing;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"easingFromSerializedString", "Lcom/alightcreative/app/motion/easing/Easing;", CmcdData.STREAMING_FORMAT_SS, "", "isImported", "", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEasingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EasingUtils.kt\ncom/alightcreative/app/motion/easing/EasingUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class EasingUtilsKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Easing easingFromSerializedString(String s2, boolean z2) {
        Easing easingEasingFromSerializedString;
        Intrinsics.checkNotNullParameter(s2, "s");
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) s2).toString(), new String[]{" "}, false, 0, 6, (Object) null);
        if (z2 && Intrinsics.areEqual(StringsKt.trim((CharSequence) listSplit$default.get(0)).toString(), ImagesContract.LOCAL)) {
            listSplit$default = CollectionsKt.drop(listSplit$default, 1);
        }
        String string = StringsKt.trim((CharSequence) listSplit$default.get(0)).toString();
        switch (string.hashCode()) {
            case -2097099063:
                if (string.equals("cubicBezier")) {
                    return new CubicBezierEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)), Float.parseFloat((String) listSplit$default.get(3)), Float.parseFloat((String) listSplit$default.get(4)));
                }
                return null;
            case -1666338091:
                if (string.equals("elastic")) {
                    return new ElasticEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)), Float.parseFloat((String) listSplit$default.get(3)), Float.parseFloat((String) listSplit$default.get(4)));
                }
                return null;
            case -1383205240:
                if (string.equals("bounce")) {
                    return new BounceEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)));
                }
                return null;
            case -1345878855:
                if (string.equals("cyclic")) {
                    return new CyclicEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)), Float.parseFloat((String) listSplit$default.get(3)), Float.parseFloat((String) listSplit$default.get(4)), Float.parseFloat((String) listSplit$default.get(5)));
                }
                return null;
            case -1102672091:
                if (string.equals("linear")) {
                    return LinearEasing.INSTANCE;
                }
                return null;
            case -938285885:
                if (string.equals("random")) {
                    return listSplit$default.size() < 7 ? new RandomEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)), Float.parseFloat((String) listSplit$default.get(3)), 0.5f, 0.5f, 0.0f) : new RandomEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)), Float.parseFloat((String) listSplit$default.get(3)), Float.parseFloat((String) listSplit$default.get(4)), Float.parseFloat((String) listSplit$default.get(5)), Float.parseFloat((String) listSplit$default.get(6)));
                }
                return null;
            case 3540684:
                if (string.equals("step")) {
                    return new StepEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)));
                }
                return null;
            case 103145323:
                if (string.equals(ImagesContract.LOCAL)) {
                    return easingFromSerializedString(CollectionsKt.joinToString$default(CollectionsKt.drop(listSplit$default, 1), " ", null, null, 0, null, null, 62, null), z2);
                }
                return null;
            case 1099846370:
                if (string.equals("reverse") && (easingEasingFromSerializedString = easingFromSerializedString(CollectionsKt.joinToString$default(CollectionsKt.drop(listSplit$default, 1), " ", null, null, 0, null, null, 62, null), z2)) != null) {
                    return new ReversedEasing(easingEasingFromSerializedString);
                }
                return null;
            case 1449507649:
                if (string.equals("elasticStep")) {
                    return new ElasticStepEasing(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)));
                }
                return null;
            default:
                return null;
        }
    }
}
