package androidx.annotation;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.safedk.android.analytics.brandsafety.l;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

/* JADX WARN: Method from annotation default annotation not found: api */
/* JADX WARN: Method from annotation default annotation not found: codename */
/* JADX WARN: Method from annotation default annotation not found: extension */
/* JADX WARN: Method from annotation default annotation not found: lambda */
/* JADX WARN: Method from annotation default annotation not found: parameter */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/annotation/ChecksSdkIntAtLeast;", "", "", l.f62634O, "", "codename", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "lambda", "extension", "<init>", "(ILjava/lang/String;III)V", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Documented
public @interface ChecksSdkIntAtLeast {
}
