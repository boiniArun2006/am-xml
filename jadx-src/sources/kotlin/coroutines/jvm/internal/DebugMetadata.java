package kotlin.coroutines.jvm.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0011\b\u0081\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\r\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", NodeModuleProcess.PROPERTY_VERSION, "", "sourceFile", "", "lineNumbers", "", "localNames", "", "spilled", "indexToLabel", JavetError.PARAMETER_METHOD_NAME, "className", "v", "()I", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/lang/String;", CmcdData.STREAM_TYPE_LIVE, "()[I", c.f62177j, "()[Ljava/lang/String;", CmcdData.STREAMING_FORMAT_SS, CmcdData.OBJECT_TYPE_INIT_SEGMENT, "m", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugMetadata {
    @JvmName(name = "c")
    String c() default "";

    @JvmName(name = InneractiveMediationDefs.GENDER_FEMALE)
    String f() default "";

    @JvmName(name = CmcdData.OBJECT_TYPE_INIT_SEGMENT)
    int[] i() default {};

    @JvmName(name = CmcdData.STREAM_TYPE_LIVE)
    int[] l() default {};

    @JvmName(name = "m")
    String m() default "";

    @JvmName(name = c.f62177j)
    String[] n() default {};

    @JvmName(name = CmcdData.STREAMING_FORMAT_SS)
    String[] s() default {};

    @JvmName(name = "v")
    int v() default 1;
}
