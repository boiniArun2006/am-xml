package androidx.compose.ui.text;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "<name for destructuring parameter 0>", c.f62177j, "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements Function1<List<? extends Integer>, Integer> {
    final /* synthetic */ Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnnotatedString f33384O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f33385n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function3 f33386t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Integer invoke(List list) {
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        this.f33385n.element = ((String) this.f33385n.element) + ((String) this.f33386t.invoke(this.f33384O.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
        return (Integer) this.J2.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) this.f33385n.element).length()));
    }
}
