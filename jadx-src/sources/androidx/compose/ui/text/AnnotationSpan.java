package androidx.compose.ui.text;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/AnnotationSpan;", "", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", c.f62177j, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "rl", "getValue", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnnotationSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String value;

    public AnnotationSpan(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
