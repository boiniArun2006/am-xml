package kuA;

import ajd.j;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.bendingspoons.crisper.internal.AsyncComputationException;
import com.bendingspoons.crisper.internal.InvalidMainFunctionResultException;
import com.caoccao.javet.exceptions.BaseJavetScriptingException;
import com.caoccao.javet.exceptions.JavetCompilationException;
import com.caoccao.javet.exceptions.JavetConverterException;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.exceptions.JavetExecutionException;
import com.caoccao.javet.exceptions.JavetScriptingError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 {
    public static final void J2(K6D.j jVar, AsyncComputationException exception) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        j.EnumC0481j enumC0481j = j.EnumC0481j.f13104r;
        pq.Ml ml = new pq.Ml();
        ml.O(PtsLKY.rlnDMSbCo, exception.getError());
        Unit unit = Unit.INSTANCE;
        jVar.rl("AsyncComputationException", enumC0481j, ml);
    }

    public static final void KN(K6D.j jVar, JavetException exception) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        jVar.rl(O(exception), j.EnumC0481j.f13104r, nr(exception));
    }

    private static final String O(JavetException javetException) {
        return javetException instanceof JavetExecutionException ? "JavetExecutionException" : javetException instanceof JavetCompilationException ? "JavetCompilationException" : javetException instanceof BaseJavetScriptingException ? "BaseJavetScriptingException" : javetException instanceof JavetConverterException ? "JavetConverterException" : "JavetException";
    }

    public static final void Uo(K6D.j jVar, InvalidMainFunctionResultException exception) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        j.EnumC0481j enumC0481j = j.EnumC0481j.f13104r;
        pq.Ml ml = new pq.Ml();
        ml.O("result_type", String.valueOf(Reflection.getOrCreateKotlinClass(exception.getResult().getClass()).getSimpleName()));
        ml.O("result_value", exception.getResult().toString());
        Unit unit = Unit.INSTANCE;
        jVar.rl("InvalidMainFunctionResultException", enumC0481j, ml);
    }

    public static final ajd.j n(String description, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"compilation", "failed"}), j.EnumC0481j.f13104r, description, "JavetCompilationException", additionalInfo);
    }

    public static final pq.Ml nr(JavetException javetException) {
        Intrinsics.checkNotNullParameter(javetException, "<this>");
        pq.Ml ml = new pq.Ml();
        if (javetException instanceof JavetExecutionException) {
            JavetScriptingError scriptingError = ((JavetExecutionException) javetException).getScriptingError();
            String resourceName = scriptingError.getResourceName();
            if (resourceName != null) {
                ml.O("file_name", resourceName);
            }
            String detailedMessage = scriptingError.getDetailedMessage();
            if (detailedMessage != null) {
                ml.O("js_message", detailedMessage);
            }
            String stack = scriptingError.getStack();
            if (stack != null) {
                ml.O("js_stack_trace", stack);
            }
            String sourceLine = scriptingError.getSourceLine();
            if (sourceLine != null) {
                ml.O("source_line", StringsKt.take(sourceLine, 100));
            }
            ml.nr("line_number", Integer.valueOf(scriptingError.getLineNumber()));
            ml.nr("start_column", Integer.valueOf(scriptingError.getStartColumn()));
            ml.nr("end_column", Integer.valueOf(scriptingError.getEndColumn()));
        }
        return ml;
    }

    public static /* synthetic */ ajd.j rl(String str, pq.Ml ml, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ml = new pq.Ml();
        }
        return n(str, ml);
    }

    public static final ajd.j t(String hook, JSONObject params) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"runtime", "operation"}), j.EnumC0481j.f13105t, "An operation using the V8 runtime.", null, pq.I28.n(pq.n.O("hook", hook), pq.n.t("params", xFr.fuX.xMQ(params))), 8, null);
    }
}
