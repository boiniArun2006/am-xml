package Bj;

import Bj.j;
import android.net.Uri;
import com.alightcreative.app.motion.templates.Template;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final j.C0016j n(Template template, Set savedTemplateIds) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        Intrinsics.checkNotNullParameter(savedTemplateIds, "savedTemplateIds");
        return new j.C0016j(template.getTemplateId(), Uri.parse(template.getSmallVideoUrl()), savedTemplateIds.contains(template.getTemplateId()), template.getTags());
    }
}
