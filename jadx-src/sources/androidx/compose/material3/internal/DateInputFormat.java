package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/internal/DateInputFormat;", "", "", "patternWithDelimiters", "", TtmlNode.RUBY_DELIMITER, "<init>", "(Ljava/lang/String;C)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "rl", "C", "()C", "t", "patternWithoutDelimiters", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DateInputFormat {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String patternWithDelimiters;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final char delimiter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String patternWithoutDelimiters;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) other;
        return Intrinsics.areEqual(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + Character.hashCode(this.delimiter);
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final char getDelimiter() {
        return this.delimiter;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public DateInputFormat(String str, char c2) {
        this.patternWithDelimiters = str;
        this.delimiter = c2;
        this.patternWithoutDelimiters = StringsKt.replace$default(str, String.valueOf(c2), "", false, 4, (Object) null);
    }
}
