package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    private static zzani zze(@Nullable zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:286|(6:425|287|288|(8:437|290|SW:291|(2:314|(2:316|(3:318|(2:320|(2:322|(3:435|325|(1:327)))(2:333|(1:335)))(2:336|(1:338))|328)(2:339|340))(1:343))(1:344)|329|421|345|463)|462|348)|(3:350|(1:359)(4:352|(1:354)(1:355)|356|(2:358|359)(1:360))|409)(1:361)|362|(3:364|(1:366)(7:(2:370|(1:372))|373|375|376|423|377|(1:379))|367)(1:374)|368|375|376|423|377|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x06dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0315 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075b, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x0630, B:345:0x0672, B:386:0x06ed, B:333:0x0643, B:336:0x064d, B:340:0x065b, B:343:0x0662, B:344:0x066a, B:350:0x0689, B:354:0x0695, B:358:0x069e, B:366:0x06b0, B:375:0x06c8, B:377:0x06d4, B:379:0x06d9, B:370:0x06b9, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070b, B:392:0x0719, B:395:0x071d, B:397:0x0727, B:399:0x0731, B:401:0x0738, B:402:0x0739, B:405:0x074c, B:408:0x0759, B:413:0x0777), top: B:440:0x0009, inners: #6, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c2 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075b, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x0630, B:345:0x0672, B:386:0x06ed, B:333:0x0643, B:336:0x064d, B:340:0x065b, B:343:0x0662, B:344:0x066a, B:350:0x0689, B:354:0x0695, B:358:0x069e, B:366:0x06b0, B:375:0x06c8, B:377:0x06d4, B:379:0x06d9, B:370:0x06b9, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070b, B:392:0x0719, B:395:0x071d, B:397:0x0727, B:399:0x0731, B:401:0x0738, B:402:0x0739, B:405:0x074c, B:408:0x0759, B:413:0x0777), top: B:440:0x0009, inners: #6, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0465 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075b, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x0630, B:345:0x0672, B:386:0x06ed, B:333:0x0643, B:336:0x064d, B:340:0x065b, B:343:0x0662, B:344:0x066a, B:350:0x0689, B:354:0x0695, B:358:0x069e, B:366:0x06b0, B:375:0x06c8, B:377:0x06d4, B:379:0x06d9, B:370:0x06b9, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070b, B:392:0x0719, B:395:0x071d, B:397:0x0727, B:399:0x0731, B:401:0x0738, B:402:0x0739, B:405:0x074c, B:408:0x0759, B:413:0x0777), top: B:440:0x0009, inners: #6, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04b3 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TRY_LEAVE, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075b, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x0630, B:345:0x0672, B:386:0x06ed, B:333:0x0643, B:336:0x064d, B:340:0x065b, B:343:0x0662, B:344:0x066a, B:350:0x0689, B:354:0x0695, B:358:0x069e, B:366:0x06b0, B:375:0x06c8, B:377:0x06d4, B:379:0x06d9, B:370:0x06b9, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070b, B:392:0x0719, B:395:0x071d, B:397:0x0727, B:399:0x0731, B:401:0x0738, B:402:0x0739, B:405:0x074c, B:408:0x0759, B:413:0x0777), top: B:440:0x0009, inners: #6, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0565 A[LOOP:1: B:121:0x027a->B:285:0x0565, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06d9 A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, zzamb -> 0x06dd, TRY_LEAVE, TryCatch #2 {zzamb -> 0x06dd, blocks: (B:377:0x06d4, B:379:0x06d9), top: B:423:0x06d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x055e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b A[Catch: IOException -> 0x0097, XmlPullParserException -> 0x009a, TryCatch #15 {IOException -> 0x0097, XmlPullParserException -> 0x009a, blocks: (B:3:0x0009, B:5:0x0065, B:7:0x0070, B:10:0x007c, B:13:0x0088, B:15:0x0090, B:22:0x00a0, B:24:0x00a8, B:28:0x00bc, B:30:0x00d5, B:32:0x00df, B:33:0x00e3, B:35:0x00ef, B:36:0x00f3, B:65:0x016e, B:83:0x01c7, B:86:0x01db, B:88:0x01e1, B:90:0x01e9, B:92:0x01f1, B:94:0x01f9, B:96:0x0201, B:98:0x0209, B:100:0x020f, B:102:0x0217, B:104:0x021f, B:106:0x0225, B:108:0x022b, B:110:0x0231, B:112:0x0239, B:115:0x0242, B:409:0x075b, B:119:0x0274, B:121:0x027a, B:123:0x0283, B:125:0x0292, B:127:0x029f, B:129:0x02b5, B:131:0x02bb, B:282:0x0558, B:134:0x02c6, B:137:0x02d2, B:266:0x0507, B:140:0x02f0, B:142:0x02f8, B:144:0x0300, B:146:0x0308, B:151:0x0315, B:154:0x032e, B:156:0x0334, B:158:0x0341, B:179:0x03a8, B:181:0x03ae, B:183:0x03b4, B:185:0x03bc, B:187:0x03c2, B:190:0x03d5, B:192:0x03db, B:194:0x03e8, B:214:0x045d, B:216:0x0465, B:236:0x04ab, B:238:0x04b3, B:264:0x04fa, B:195:0x03f3, B:196:0x03f4, B:197:0x03f5, B:198:0x0402, B:201:0x040a, B:204:0x0418, B:206:0x041e, B:208:0x0429, B:209:0x043d, B:210:0x043e, B:211:0x043f, B:212:0x044c, B:159:0x034a, B:160:0x034b, B:161:0x034c, B:163:0x0357, B:166:0x0361, B:169:0x036a, B:171:0x0370, B:173:0x037b, B:174:0x038d, B:175:0x038e, B:176:0x038f, B:177:0x0397, B:269:0x051a, B:271:0x0528, B:273:0x0533, B:275:0x0539, B:277:0x0545, B:287:0x0573, B:290:0x0596, B:325:0x0627, B:327:0x0630, B:345:0x0672, B:386:0x06ed, B:333:0x0643, B:336:0x064d, B:340:0x065b, B:343:0x0662, B:344:0x066a, B:350:0x0689, B:354:0x0695, B:358:0x069e, B:366:0x06b0, B:375:0x06c8, B:377:0x06d4, B:379:0x06d9, B:370:0x06b9, B:68:0x017b, B:70:0x0187, B:73:0x0190, B:75:0x0196, B:77:0x01a1, B:78:0x01ad, B:79:0x01ae, B:80:0x01af, B:40:0x010f, B:42:0x011b, B:45:0x0127, B:47:0x012d, B:49:0x0134, B:51:0x013a, B:57:0x0150, B:64:0x0166, B:60:0x015d, B:63:0x0165, B:390:0x070b, B:392:0x0719, B:395:0x071d, B:397:0x0727, B:399:0x0731, B:401:0x0738, B:402:0x0739, B:405:0x074c, B:408:0x0759, B:413:0x0777), top: B:440:0x0009, inners: #6, #7, #10, #11, #14 }] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.google.android.gms.internal.ads.zzang, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.zzani, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.gms.internal.ads.zzane] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzama zzb(byte[] bArr, int i2, int i3) {
        String str;
        String str2;
        String str3;
        HashMap map;
        ArrayDeque arrayDeque;
        zzand zzandVar;
        int i5;
        ?? r22;
        ArrayDeque arrayDeque2;
        ?? zzaneVar;
        zzand zzandVar2;
        ?? r222;
        zzani zzaniVarZzd;
        String str4;
        long jZzg;
        long jZzg2;
        long jZzg3;
        String[] strArr;
        String strSubstring;
        zzanc zzancVar;
        zzanc zzancVar2;
        long j2;
        long j3;
        long j4;
        Object obj;
        byte b2;
        String str5;
        String str6;
        String str7;
        String strZzc;
        String str8;
        String strZzL;
        String str9;
        HashMap map2;
        String str10;
        float f3;
        float f4;
        ?? zzangVar;
        String strZzc2;
        float f5;
        float f6;
        String strZzc3;
        float f7;
        int i7;
        String strZzc4;
        byte b4;
        byte b5;
        String strZzc5;
        zzani zzaniVar;
        zzani zzaniVar2;
        String str11;
        float f8;
        String strGroup;
        String strGroup2;
        boolean z2;
        String strZzc6;
        int i8 = 1;
        String str12 = "";
        String str13 = "http://www.w3.org/ns/ttml#parameter";
        String str14 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzang("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzand zzandVar3 = zzh;
            zzanj zzanjVar = null;
            ?? r223 = 0;
            zzand zzandVar4 = zzandVar3;
            int i9 = 15;
            int i10 = 0;
            while (eventType != i8) {
                zzanc zzancVar3 = (zzanc) arrayDeque3.peek();
                if (i10 == 0) {
                    ?? r51 = obj2;
                    String name = xmlPullParserNewPullParser.getName();
                    int i11 = i8;
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str13, "frameRate");
                            int i12 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            str = str12;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str13, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str15 = zzfj.zza;
                                arrayDeque2 = arrayDeque3;
                                zzgrc.zzb(attributeValue2.split(" ", -1).length == 2 ? i11 : 0, "frameRateMultiplier doesn't have 2 parts");
                                f8 = Integer.parseInt(r6[0]) / Integer.parseInt(r6[i11]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                f8 = 1.0f;
                            }
                            int i13 = zzandVar3.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str13, "subFrameRate");
                            if (attributeValue3 != null) {
                                i13 = Integer.parseInt(attributeValue3);
                            }
                            int i14 = zzandVar3.zzc;
                            float f9 = f8;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str13, "tickRate");
                            if (attributeValue4 != null) {
                                i14 = Integer.parseInt(attributeValue4);
                            }
                            zzand zzandVar5 = new zzand(i12 * f9, i13, i14);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str13, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str13;
                                zzandVar4 = zzandVar5;
                                zzandVar = zzandVar3;
                                i9 = 15;
                                strZzc6 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                if (strZzc6 != null) {
                                    zzaneVar = r51;
                                } else {
                                    Matcher matcher = zzf.matcher(strZzc6);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            if (strGroup3 == null) {
                                                throw r51;
                                            }
                                            int i15 = Integer.parseInt(strGroup3);
                                            String strGroup4 = matcher.group(2);
                                            if (strGroup4 == null) {
                                                throw r51;
                                            }
                                            zzaneVar = new zzane(i15, Integer.parseInt(strGroup4));
                                        } catch (NumberFormatException unused) {
                                            zzee.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc6));
                                            zzaneVar = r51;
                                        }
                                    } else {
                                        zzee.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc6));
                                    }
                                    zzaneVar = r51;
                                }
                            } else {
                                Matcher matcher2 = zzg.matcher(attributeValue5);
                                if (matcher2.matches()) {
                                    str2 = str13;
                                    try {
                                        strGroup = matcher2.group(i11);
                                    } catch (NumberFormatException unused2) {
                                        zzandVar4 = zzandVar5;
                                    }
                                    if (strGroup == null) {
                                        throw r51;
                                    }
                                    int i16 = Integer.parseInt(strGroup);
                                    zzandVar4 = zzandVar5;
                                    try {
                                        strGroup2 = matcher2.group(2);
                                    } catch (NumberFormatException unused3) {
                                        zzandVar = zzandVar3;
                                        zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i9 = 15;
                                        strZzc6 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                        if (strZzc6 != null) {
                                        }
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        map4 = map;
                                        arrayDeque3 = arrayDeque;
                                        i8 = i5;
                                        str12 = str;
                                        str13 = str2;
                                        zzandVar3 = zzandVar;
                                        str14 = str3;
                                        obj2 = null;
                                        r223 = r223;
                                    }
                                    if (strGroup2 == null) {
                                        throw r51;
                                    }
                                    int i17 = Integer.parseInt(strGroup2);
                                    if (i16 == 0) {
                                        zzandVar = zzandVar3;
                                        z2 = false;
                                    } else if (i17 != 0) {
                                        zzandVar = zzandVar3;
                                        z2 = true;
                                    } else {
                                        zzandVar = zzandVar3;
                                        i17 = 0;
                                        z2 = false;
                                    }
                                    try {
                                        zzgrc.zzg(z2, "Invalid cell resolution %s %s", i16, i17);
                                        i9 = i17;
                                    } catch (NumberFormatException unused4) {
                                        zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i9 = 15;
                                    }
                                    strZzc6 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                    if (strZzc6 != null) {
                                    }
                                } else {
                                    zzee.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str13;
                                    zzandVar4 = zzandVar5;
                                    zzandVar = zzandVar3;
                                    i9 = 15;
                                    strZzc6 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                    if (strZzc6 != null) {
                                    }
                                }
                            }
                            xmlPullParserNewPullParser.next();
                            eventType = xmlPullParserNewPullParser.getEventType();
                            map4 = map;
                            arrayDeque3 = arrayDeque;
                            i8 = i5;
                            str12 = str;
                            str13 = str2;
                            zzandVar3 = zzandVar;
                            str14 = str3;
                            obj2 = null;
                            r223 = r223;
                        } else {
                            str = str12;
                            str2 = str13;
                            arrayDeque2 = arrayDeque3;
                            zzandVar = zzandVar3;
                            zzaneVar = r223;
                        }
                        zzand zzandVar6 = zzandVar4;
                        ?? r7 = zzaneVar;
                        int i18 = i9;
                        boolean zEquals = name.equals(TtmlNode.TAG_TT);
                        String str16 = "image";
                        String str17 = TtmlNode.TAG_METADATA;
                        String str18 = TtmlNode.TAG_REGION;
                        String str19 = TtmlNode.TAG_HEAD;
                        zzandVar4 = zzandVar6;
                        if (zEquals || name.equals(TtmlNode.TAG_HEAD) || name.equals("body") || name.equals(TtmlNode.TAG_DIV) || name.equals(TtmlNode.TAG_P) || name.equals(TtmlNode.TAG_SPAN) || name.equals("br") || name.equals("style") || name.equals(TtmlNode.TAG_STYLING) || name.equals(TtmlNode.TAG_LAYOUT) || name.equals(TtmlNode.TAG_REGION) || name.equals(TtmlNode.TAG_METADATA) || name.equals("image") || name.equals("data") || name.equals(TtmlNode.TAG_INFORMATION)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzfq.zzb(xmlPullParserNewPullParser, "style")) {
                                        String strZzc7 = zzfq.zzc(xmlPullParserNewPullParser, "style");
                                        zzani zzaniVarZzd2 = zzd(xmlPullParserNewPullParser, new zzani());
                                        if (strZzc7 != null) {
                                            String[] strArrZzc = zzc(strZzc7);
                                            str3 = str14;
                                            int length = strArrZzc.length;
                                            str5 = str19;
                                            int i19 = 0;
                                            while (i19 < length) {
                                                int i20 = i19;
                                                zzaniVarZzd2.zzr((zzani) map3.get(strArrZzc[i20]));
                                                i19 = i20 + 1;
                                            }
                                        } else {
                                            str5 = str19;
                                            str3 = str14;
                                        }
                                        String strZzt = zzaniVarZzd2.zzt();
                                        if (strZzt != null) {
                                            map3.put(strZzt, zzaniVarZzd2);
                                        }
                                        map = map4;
                                        str6 = str17;
                                        str7 = str18;
                                    } else {
                                        str5 = str19;
                                        str3 = str14;
                                        if (zzfq.zzb(xmlPullParserNewPullParser, str18)) {
                                            str7 = str18;
                                            HashMap map6 = map5;
                                            String strZzc8 = zzfq.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc8 == null) {
                                                zzangVar = r51;
                                                str9 = str16;
                                                map2 = map4;
                                                str10 = str17;
                                            } else {
                                                String strZzc9 = zzfq.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc9 == null) {
                                                    str8 = strZzc9;
                                                    String strZzc10 = zzfq.zzc(xmlPullParserNewPullParser, "style");
                                                    if (strZzc10 != null && (zzaniVar2 = (zzani) map3.get(strZzc10)) != null) {
                                                        strZzL = zzaniVar2.zzL();
                                                    }
                                                    if (strZzL == null) {
                                                        str9 = str16;
                                                        Matcher matcher3 = zzb.matcher(strZzL);
                                                        str10 = str17;
                                                        Matcher matcher4 = zzf.matcher(strZzL);
                                                        if (matcher3.matches()) {
                                                            map2 = map4;
                                                            try {
                                                                String strGroup5 = matcher3.group(1);
                                                                if (strGroup5 == null) {
                                                                    throw r51;
                                                                }
                                                                float f10 = Float.parseFloat(strGroup5) / 100.0f;
                                                                String strGroup6 = matcher3.group(2);
                                                                if (strGroup6 == null) {
                                                                    throw r51;
                                                                }
                                                                f3 = Float.parseFloat(strGroup6) / 100.0f;
                                                                f4 = f10;
                                                            } catch (NumberFormatException unused5) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                            }
                                                        } else {
                                                            map2 = map4;
                                                            if (!matcher4.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                            } else if (r7 == 0) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                            } else {
                                                                try {
                                                                    String strGroup7 = matcher4.group(1);
                                                                    if (strGroup7 == null) {
                                                                        throw r51;
                                                                    }
                                                                    int i21 = Integer.parseInt(strGroup7);
                                                                    String strGroup8 = matcher4.group(2);
                                                                    if (strGroup8 == null) {
                                                                        throw r51;
                                                                    }
                                                                    f3 = Integer.parseInt(strGroup8) / r7.zzb;
                                                                    f4 = i21 / r7.zza;
                                                                } catch (NumberFormatException unused6) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                }
                                                            }
                                                            zzangVar = r51;
                                                        }
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        map4 = map;
                                                        arrayDeque3 = arrayDeque;
                                                        i8 = i5;
                                                        str12 = str;
                                                        str13 = str2;
                                                        zzandVar3 = zzandVar;
                                                        str14 = str3;
                                                        obj2 = null;
                                                        r223 = r223;
                                                    } else {
                                                        str9 = str16;
                                                        map2 = map4;
                                                        str10 = str17;
                                                        f3 = 0.0f;
                                                        f4 = 0.0f;
                                                    }
                                                    strZzc2 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                    if (strZzc2 == null && (strZzc5 = zzfq.zzc(xmlPullParserNewPullParser, "style")) != null && (zzaniVar = (zzani) map3.get(strZzc5)) != null) {
                                                        strZzc2 = zzaniVar.zzN();
                                                    }
                                                    if (strZzc2 == null) {
                                                        Matcher matcher5 = zzb.matcher(strZzc2);
                                                        Matcher matcher6 = zzf.matcher(strZzc2);
                                                        if (matcher5.matches()) {
                                                            try {
                                                                String strGroup9 = matcher5.group(1);
                                                                if (strGroup9 == null) {
                                                                    throw r51;
                                                                }
                                                                float f11 = Float.parseFloat(strGroup9) / 100.0f;
                                                                String strGroup10 = matcher5.group(2);
                                                                if (strGroup10 == null) {
                                                                    throw r51;
                                                                }
                                                                f6 = Float.parseFloat(strGroup10) / 100.0f;
                                                                f5 = f11;
                                                            } catch (NumberFormatException unused7) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                zzangVar = r51;
                                                            }
                                                        } else {
                                                            if (!matcher6.matches()) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                            } else if (r7 == 0) {
                                                                zzee.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                            } else {
                                                                try {
                                                                    String strGroup11 = matcher6.group(1);
                                                                    if (strGroup11 == null) {
                                                                        throw r51;
                                                                    }
                                                                    int i22 = Integer.parseInt(strGroup11);
                                                                    String strGroup12 = matcher6.group(2);
                                                                    if (strGroup12 == null) {
                                                                        throw r51;
                                                                    }
                                                                    f6 = Integer.parseInt(strGroup12) / r7.zzb;
                                                                    f5 = i22 / r7.zza;
                                                                } catch (NumberFormatException unused8) {
                                                                    zzee.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                    zzangVar = r51;
                                                                }
                                                            }
                                                            zzangVar = r51;
                                                        }
                                                    } else {
                                                        f5 = 1.0f;
                                                        f6 = 1.0f;
                                                    }
                                                    strZzc3 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                    if (strZzc3 == null) {
                                                        String strZza = zzgql.zza(strZzc3);
                                                        int iHashCode = strZza.hashCode();
                                                        if (iHashCode != -1364013995) {
                                                            b5 = (iHashCode == 92734940 && strZza.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) ? (byte) 1 : (byte) -1;
                                                            if (b5 != 0) {
                                                                f7 = f3 + (f6 / 2.0f);
                                                                i7 = 1;
                                                            } else if (b5 != 1) {
                                                                f7 = f3;
                                                                i7 = 0;
                                                            } else {
                                                                f7 = f3 + f6;
                                                                i7 = 2;
                                                            }
                                                            float f12 = 1.0f / i18;
                                                            strZzc4 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                            if (strZzc4 == null) {
                                                                String strZza2 = zzgql.zza(strZzc4);
                                                                int iHashCode2 = strZza2.hashCode();
                                                                if (iHashCode2 == 3694) {
                                                                    if (strZza2.equals("tb")) {
                                                                        b4 = 0;
                                                                    }
                                                                    if (b4 == 0) {
                                                                    }
                                                                } else if (iHashCode2 != 3553396) {
                                                                    b4 = (iHashCode2 == 3553576 && strZza2.equals(TtmlNode.VERTICAL_RL)) ? (byte) 2 : (byte) -1;
                                                                    int i23 = (b4 == 0 || b4 == 1) ? 2 : b4 != 2 ? Integer.MIN_VALUE : 1;
                                                                    zzangVar = new zzang(strZzc8, f4, f7, 0, i7, f5, f6, 1, f12, i23);
                                                                } else {
                                                                    if (strZza2.equals(TtmlNode.VERTICAL_LR)) {
                                                                        b4 = 1;
                                                                    }
                                                                    if (b4 == 0) {
                                                                        zzangVar = new zzang(strZzc8, f4, f7, 0, i7, f5, f6, 1, f12, i23);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (strZza.equals(TtmlNode.CENTER)) {
                                                                b5 = 0;
                                                            }
                                                            if (b5 != 0) {
                                                            }
                                                            float f122 = 1.0f / i18;
                                                            strZzc4 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
                                                            if (strZzc4 == null) {
                                                            }
                                                        }
                                                    }
                                                    xmlPullParserNewPullParser.next();
                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                    map4 = map;
                                                    arrayDeque3 = arrayDeque;
                                                    i8 = i5;
                                                    str12 = str;
                                                    str13 = str2;
                                                    zzandVar3 = zzandVar;
                                                    str14 = str3;
                                                    obj2 = null;
                                                    r223 = r223;
                                                } else {
                                                    str8 = strZzc9;
                                                }
                                                strZzL = str8;
                                                if (strZzL == null) {
                                                }
                                                strZzc2 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                if (strZzc2 == null) {
                                                    strZzc2 = zzaniVar.zzN();
                                                }
                                                if (strZzc2 == null) {
                                                }
                                                strZzc3 = zzfq.zzc(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strZzc3 == null) {
                                                }
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                map4 = map;
                                                arrayDeque3 = arrayDeque;
                                                i8 = i5;
                                                str12 = str;
                                                str13 = str2;
                                                zzandVar3 = zzandVar;
                                                str14 = str3;
                                                obj2 = null;
                                                r223 = r223;
                                            }
                                            if (zzangVar != 0) {
                                                map = map2;
                                                map.put(zzangVar.zza, zzangVar);
                                            } else {
                                                map = map2;
                                            }
                                            str11 = str5;
                                            map5 = map6;
                                            str16 = str9;
                                            str6 = str10;
                                            if (zzfq.zza(xmlPullParserNewPullParser, str11)) {
                                                str17 = str6;
                                                map4 = map;
                                                str18 = str7;
                                                str14 = str3;
                                                str19 = str11;
                                            } else {
                                                zzandVar2 = zzandVar4;
                                                arrayDeque = arrayDeque2;
                                            }
                                        } else {
                                            String str20 = str16;
                                            map = map4;
                                            HashMap map7 = map5;
                                            str6 = str17;
                                            str7 = str18;
                                            if (zzfq.zzb(xmlPullParserNewPullParser, str6)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str16 = str20;
                                                    if (!zzfq.zzb(xmlPullParserNewPullParser, str16) || (strZzc = zzfq.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map5 = map7;
                                                    } else {
                                                        map5 = map7;
                                                        map5.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzfq.zza(xmlPullParserNewPullParser, str6)) {
                                                        str20 = str16;
                                                        map7 = map5;
                                                    }
                                                }
                                            } else {
                                                map5 = map7;
                                                str16 = str20;
                                            }
                                        }
                                    }
                                    str11 = str5;
                                    if (zzfq.zza(xmlPullParserNewPullParser, str11)) {
                                    }
                                }
                            } else {
                                str3 = str14;
                                map = map4;
                                Object obj3 = TtmlNode.TAG_REGION;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzaniVarZzd = zzd(xmlPullParserNewPullParser, r51);
                                    int i24 = 0;
                                    str4 = str;
                                    jZzg = -9223372036854775807L;
                                    jZzg2 = -9223372036854775807L;
                                    jZzg3 = -9223372036854775807L;
                                    strArr = null;
                                    strSubstring = null;
                                    while (i24 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i24);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i24);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj3;
                                                    b2 = !attributeName.equals(obj) ? (byte) -1 : (byte) 4;
                                                    break;
                                                case 99841:
                                                    if (attributeName.equals("dur")) {
                                                        obj = obj3;
                                                        b2 = 2;
                                                    }
                                                    obj = obj3;
                                                    break;
                                                case 100571:
                                                    if (attributeName.equals(TtmlNode.END)) {
                                                        obj = obj3;
                                                        b2 = 1;
                                                    }
                                                    obj = obj3;
                                                    break;
                                                case 93616297:
                                                    if (attributeName.equals("begin")) {
                                                        b2 = 0;
                                                        obj = obj3;
                                                    }
                                                    obj = obj3;
                                                    break;
                                                case 109780401:
                                                    if (attributeName.equals("style")) {
                                                        obj = obj3;
                                                        b2 = 3;
                                                    }
                                                    obj = obj3;
                                                    break;
                                                case 1292595405:
                                                    if (attributeName.equals("backgroundImage")) {
                                                        obj = obj3;
                                                        b2 = 5;
                                                    }
                                                    obj = obj3;
                                                    break;
                                                default:
                                                    obj = obj3;
                                                    break;
                                            }
                                            if (b2 == 0) {
                                                zzandVar2 = zzandVar4;
                                                jZzg2 = zzg(attributeValue6, zzandVar2);
                                            } else if (b2 == 1) {
                                                zzandVar2 = zzandVar4;
                                                jZzg = zzg(attributeValue6, zzandVar2);
                                            } else if (b2 != 2) {
                                                if (b2 == 3) {
                                                    String[] strArrZzc2 = zzc(attributeValue6);
                                                    if (strArrZzc2.length > 0) {
                                                        strArr = strArrZzc2;
                                                    }
                                                } else if (b2 != 4) {
                                                    if (b2 == 5) {
                                                        try {
                                                            if (attributeValue6.startsWith(obbPUqyhtS.noaRZKxDtFdfgw)) {
                                                                strSubstring = attributeValue6.substring(1);
                                                            }
                                                        } catch (zzamb e2) {
                                                            e = e2;
                                                            zzandVar2 = zzandVar4;
                                                            arrayDeque = arrayDeque2;
                                                            zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                            zzandVar4 = zzandVar2;
                                                            r222 = r7;
                                                            i9 = i18;
                                                            i10 = 1;
                                                            r22 = r222;
                                                            i5 = 1;
                                                            r223 = r22;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            map4 = map;
                                                            arrayDeque3 = arrayDeque;
                                                            i8 = i5;
                                                            str12 = str;
                                                            str13 = str2;
                                                            zzandVar3 = zzandVar;
                                                            str14 = str3;
                                                            obj2 = null;
                                                            r223 = r223;
                                                        }
                                                    }
                                                } else if (map.containsKey(attributeValue6)) {
                                                    str4 = attributeValue6;
                                                }
                                                zzandVar2 = zzandVar4;
                                            } else {
                                                zzandVar2 = zzandVar4;
                                                jZzg3 = zzg(attributeValue6, zzandVar2);
                                            }
                                            try {
                                                i24++;
                                                obj3 = obj;
                                                zzandVar4 = zzandVar2;
                                            } catch (zzamb e3) {
                                                e = e3;
                                                arrayDeque = arrayDeque2;
                                                zzee.zzd("TtmlParser", "Suppressing parser error", e);
                                                zzandVar4 = zzandVar2;
                                                r222 = r7;
                                                i9 = i18;
                                                i10 = 1;
                                                r22 = r222;
                                                i5 = 1;
                                                r223 = r22;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                map4 = map;
                                                arrayDeque3 = arrayDeque;
                                                i8 = i5;
                                                str12 = str;
                                                str13 = str2;
                                                zzandVar3 = zzandVar;
                                                str14 = str3;
                                                obj2 = null;
                                                r223 = r223;
                                            }
                                        } catch (zzamb e4) {
                                            e = e4;
                                            zzandVar2 = zzandVar4;
                                        }
                                    }
                                    zzandVar2 = zzandVar4;
                                } catch (zzamb e5) {
                                    e = e5;
                                    zzandVar2 = zzandVar4;
                                    arrayDeque = arrayDeque2;
                                }
                                if (zzancVar3 != null) {
                                    zzancVar = zzancVar3;
                                    long j5 = zzancVar.zzd;
                                    if (j5 == -9223372036854775807L) {
                                        zzancVar2 = zzancVar;
                                    } else {
                                        jZzg2 = jZzg2 != -9223372036854775807L ? jZzg2 + j5 : -9223372036854775807L;
                                        if (jZzg != -9223372036854775807L) {
                                            jZzg += j5;
                                            zzancVar2 = zzancVar;
                                        } else {
                                            zzancVar2 = zzancVar;
                                            jZzg = -9223372036854775807L;
                                        }
                                    }
                                    xmlPullParserNewPullParser.next();
                                    eventType = xmlPullParserNewPullParser.getEventType();
                                    map4 = map;
                                    arrayDeque3 = arrayDeque;
                                    i8 = i5;
                                    str12 = str;
                                    str13 = str2;
                                    zzandVar3 = zzandVar;
                                    str14 = str3;
                                    obj2 = null;
                                    r223 = r223;
                                } else {
                                    zzancVar = zzancVar3;
                                    zzancVar2 = null;
                                }
                                if (jZzg == -9223372036854775807L) {
                                    if (jZzg3 != -9223372036854775807L) {
                                        j4 = jZzg2 + jZzg3;
                                    } else {
                                        if (zzancVar2 != null) {
                                            j4 = zzancVar2.zze;
                                            if (j4 != -9223372036854775807L) {
                                            }
                                        }
                                        j3 = jZzg2;
                                        j2 = -9223372036854775807L;
                                        zzanc zzancVarZzb = zzanc.zzb(xmlPullParserNewPullParser.getName(), j3, j2, zzaniVarZzd, strArr, str4, strSubstring, zzancVar2);
                                        arrayDeque = arrayDeque2;
                                        arrayDeque.push(zzancVarZzb);
                                        if (zzancVar != null) {
                                            zzancVar.zzd(zzancVarZzb);
                                        }
                                    }
                                    j2 = j4;
                                } else {
                                    j2 = jZzg;
                                }
                                j3 = jZzg2;
                                zzanc zzancVarZzb2 = zzanc.zzb(xmlPullParserNewPullParser.getName(), j3, j2, zzaniVarZzd, strArr, str4, strSubstring, zzancVar2);
                                arrayDeque = arrayDeque2;
                                arrayDeque.push(zzancVarZzb2);
                                if (zzancVar != null) {
                                }
                            }
                            zzandVar4 = zzandVar2;
                            r22 = r7;
                            i9 = i18;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str14);
                            sb.append(name2);
                            zzee.zzb("TtmlParser", sb.toString());
                            r222 = r7;
                            str3 = str14;
                            i9 = i18;
                            map = map4;
                            arrayDeque = arrayDeque2;
                        }
                        i10 = 1;
                        r22 = r222;
                    } else {
                        str = str12;
                        str2 = str13;
                        str3 = str14;
                        map = map4;
                        arrayDeque = arrayDeque3;
                        zzandVar = zzandVar3;
                        if (eventType != 4) {
                            r22 = r223;
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                    zzanc zzancVar4 = (zzanc) arrayDeque.peek();
                                    if (zzancVar4 == null) {
                                        throw null;
                                    }
                                    zzanjVar = new zzanj(zzancVar4, map3, map, map5);
                                }
                                arrayDeque.pop();
                                r22 = r223;
                            }
                        } else {
                            if (zzancVar3 == null) {
                                throw null;
                            }
                            zzancVar3.zzd(zzanc.zza(xmlPullParserNewPullParser.getText()));
                            r22 = r223;
                        }
                    }
                    i5 = 1;
                    r223 = r22;
                } else {
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    map = map4;
                    arrayDeque = arrayDeque3;
                    zzandVar = zzandVar3;
                    if (eventType == 2) {
                        i5 = 1;
                        i10++;
                        r223 = r223;
                    } else {
                        i5 = 1;
                        if (eventType == 3) {
                            i10--;
                        }
                        xmlPullParserNewPullParser.next();
                        eventType = xmlPullParserNewPullParser.getEventType();
                        map4 = map;
                        arrayDeque3 = arrayDeque;
                        i8 = i5;
                        str12 = str;
                        str13 = str2;
                        zzandVar3 = zzandVar;
                        str14 = str3;
                        obj2 = null;
                        r223 = r223;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map4 = map;
                arrayDeque3 = arrayDeque;
                i8 = i5;
                str12 = str;
                str13 = str2;
                zzandVar3 = zzandVar;
                str14 = str3;
                obj2 = null;
                r223 = r223;
            }
            if (zzanjVar != null) {
                return zzanjVar;
            }
            throw null;
        } catch (IOException e6) {
            throw new IllegalStateException("Unexpected error when reading input.", e6);
        } catch (XmlPullParserException e7) {
            throw new IllegalStateException("Unable to decode source", e7);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x037c A[Catch: zzamb -> 0x03d0, TryCatch #1 {zzamb -> 0x03d0, blocks: (B:168:0x02e3, B:170:0x02fe, B:173:0x0314, B:175:0x031a, B:177:0x0320, B:198:0x0356, B:203:0x037f, B:205:0x0385, B:206:0x038e, B:199:0x035a, B:200:0x0377, B:201:0x0378, B:202:0x037c, B:207:0x038f, B:208:0x0390, B:209:0x03ad, B:172:0x0307, B:210:0x03ae, B:211:0x03cf), top: B:229:0x02e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0385 A[Catch: zzamb -> 0x03d0, TryCatch #1 {zzamb -> 0x03d0, blocks: (B:168:0x02e3, B:170:0x02fe, B:173:0x0314, B:175:0x031a, B:177:0x0320, B:198:0x0356, B:203:0x037f, B:205:0x0385, B:206:0x038e, B:199:0x035a, B:200:0x0377, B:201:0x0378, B:202:0x037c, B:207:0x038f, B:208:0x0390, B:209:0x03ad, B:172:0x0307, B:210:0x03ae, B:211:0x03cf), top: B:229:0x02e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzani zzd(XmlPullParser xmlPullParser, zzani zzaniVar) {
        ?? r7;
        Matcher matcher;
        byte b2;
        String strGroup;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z2 = false;
        zzani zzaniVarZze = zzaniVar;
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r112 = -1;
             = -1;
             = -1;
            ?? r113 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r114 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE) ? -1 : 6;
                    break;
                case -1289044182:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_EXTENT) ? -1 : 16;
                    break;
                case -1224696685:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY) ? -1 : 3;
                    break;
                case -1065511464:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN) ? -1 : 7;
                    break;
                case -1008619738:
                    r7 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION) ? -1 : 12;
                    break;
                case -734428249:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT) ? -1 : 5;
                    break;
                case 3355:
                    r7 = !attributeName.equals("id") ? -1 : z2;
                    break;
                case 3511770:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_RUBY) ? -1 : 10;
                    break;
                case 94842723:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_COLOR) ? -1 : 2;
                    break;
                case 109403361:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_SHEAR) ? -1 : 14;
                    break;
                case 110138194:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_COMBINE) ? -1 : 9;
                    break;
                case 365601008:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE) ? -1 : 4;
                    break;
                case 921125321:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_TEXT_EMPHASIS) ? -1 : 13;
                    break;
                case 1115953443:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_RUBY_POSITION) ? -1 : 11;
                    break;
                case 1287124693:
                    r7 = !attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR) ? -1 : 1;
                    break;
                case 1754920356:
                    r7 = !attributeName.equals(TtmlNode.ATTR_EBUTTS_MULTI_ROW_ALIGN) ? -1 : 8;
                    break;
                default:
                    r7 = -1;
                    break;
            }
            switch (r7) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzs(attributeValue);
                    }
                    break;
                case 1:
                    zzaniVarZze = zze(zzaniVarZze);
                    try {
                        zzaniVarZze.zzn(zzdp.zza(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        zzee.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 2:
                    zzaniVarZze = zze(zzaniVarZze);
                    try {
                        zzaniVarZze.zzk(zzdp.zza(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        zzee.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 3:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzaniVarZze = zze(zzaniVarZze);
                        String str = zzfj.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzamb(sb.toString());
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzee.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(attributeValue.length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzamb(sb2.toString());
                        }
                        String strGroup2 = matcher.group(3);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        int iHashCode = strGroup2.hashCode();
                        if (iHashCode == 37) {
                            if (strGroup2.equals("%")) {
                                b2 = 2;
                            }
                            if (b2 == 0) {
                            }
                            strGroup = matcher.group(1);
                            if (strGroup == null) {
                            }
                        } else if (iHashCode != 3240) {
                            b2 = (iHashCode == 3592 && strGroup2.equals("px")) ? (byte) 0 : (byte) -1;
                            if (b2 == 0) {
                                zzaniVarZze.zzH(1);
                            } else if (b2 == 1) {
                                zzaniVarZze.zzH(2);
                            } else {
                                if (b2 != 2) {
                                    StringBuilder sb3 = new StringBuilder(strGroup2.length() + 30);
                                    sb3.append("Invalid unit for fontSize: '");
                                    sb3.append(strGroup2);
                                    sb3.append("'.");
                                    throw new zzamb(sb3.toString());
                                }
                                zzaniVarZze.zzH(3);
                            }
                            strGroup = matcher.group(1);
                            if (strGroup == null) {
                                throw null;
                            }
                            zzaniVarZze.zzG(Float.parseFloat(strGroup));
                            break;
                        } else {
                            if (strGroup2.equals("em")) {
                                b2 = 1;
                            }
                            if (b2 == 0) {
                            }
                            strGroup = matcher.group(1);
                            if (strGroup == null) {
                            }
                        }
                    } catch (zzamb unused3) {
                        zzee.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                    break;
                case 5:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzf(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzg(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String strZza = zzgql.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals("none")) {
                            r11 = z2;
                        }
                    } else if (strZza.equals("all")) {
                        r11 = 1;
                    }
                    if (r11 == 0) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzD(z2);
                    } else if (r11 == 1) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzD(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzgql.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals(TtmlNode.RUBY_BASE_CONTAINER)) {
                                r114 = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals(TtmlNode.RUBY_CONTAINER)) {
                                r114 = z2;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals(TtmlNode.RUBY_DELIMITER)) {
                                r114 = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals(obbPUqyhtS.GlpMbY)) {
                                r114 = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals(TtmlNode.RUBY_BASE)) {
                                r114 = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r114 = 3;
                            }
                            break;
                    }
                    if (r114 == 0) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzu(1);
                    } else if (r114 == 1 || r114 == 2) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzu(2);
                    } else if (r114 == 3 || r114 == 4) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzu(3);
                    } else if (r114 == 5) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzu(4);
                    }
                    break;
                case 11:
                    String strZza3 = zzgql.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            r113 = 1;
                        }
                    } else if (strZza3.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        r113 = z2;
                    }
                    if (r113 == 0) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzw(1);
                    } else if (r113 == 1) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzw(2);
                    }
                    break;
                case 12:
                    String strZza4 = zzgql.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals(TtmlNode.NO_UNDERLINE)) {
                                r112 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals(TtmlNode.UNDERLINE)) {
                                r112 = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals(TtmlNode.NO_LINETHROUGH)) {
                                r112 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals(TtmlNode.LINETHROUGH)) {
                                r112 = z2;
                            }
                            break;
                    }
                    if (r112 == 0) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzc(true);
                    } else if (r112 == 1) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zzc(z2);
                    } else if (r112 == 2) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zze(true);
                    } else if (r112 == 3) {
                        zzaniVarZze = zze(zzaniVarZze);
                        zzaniVarZze.zze(z2);
                    }
                    break;
                case 13:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzF(zzanb.zza(attributeValue));
                    break;
                case 14:
                    zzani zzaniVarZze2 = zze(zzaniVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e2) {
                            zzee.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e2);
                        }
                    } else {
                        zzee.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzaniVarZze2.zzp(fMin);
                    zzaniVarZze = zzaniVarZze2;
                    break;
                case 15:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzK(attributeValue);
                    break;
                case 16:
                    zzaniVarZze = zze(zzaniVarZze);
                    zzaniVarZze.zzM(attributeValue);
                    break;
            }
            i2++;
            z2 = false;
        }
        return zzaniVarZze;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzg(String str, zzand zzandVar) throws zzamb {
        double d2;
        double d4;
        Matcher matcher = zzc.matcher(str);
        byte b2 = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j3 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d5 = j2 + j3;
            double d6 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d7 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d8 = d5 + d6;
            return (long) ((d8 + d7 + (matcher.group(5) != null ? Long.parseLong(r13) / zzandVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) zzandVar.zzb)) / ((double) zzandVar.zza) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzamb("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d9 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            b2 = (iHashCode == 116 && strGroup6.equals("t")) ? (byte) 5 : (byte) -1;
                        } else if (!strGroup6.equals(CmcdData.STREAMING_FORMAT_SS)) {
                        }
                    } else if (strGroup6.equals("ms")) {
                        b2 = 3;
                    }
                } else if (strGroup6.equals("m")) {
                    b2 = 1;
                }
            } else if (strGroup6.equals(CmcdData.STREAMING_FORMAT_HLS)) {
                b2 = 0;
            }
        } else if (strGroup6.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
            b2 = 4;
        }
        if (b2 == 0) {
            d2 = 3600.0d;
        } else {
            if (b2 != 1) {
                if (b2 == 3) {
                    d4 = 1000.0d;
                } else {
                    if (b2 != 4) {
                        if (b2 == 5) {
                            d4 = zzandVar.zzc;
                        }
                        return (long) (d9 * 1000000.0d);
                    }
                    d4 = zzandVar.zza;
                }
                d9 /= d4;
                return (long) (d9 * 1000000.0d);
            }
            d2 = 60.0d;
        }
        d9 *= d2;
        return (long) (d9 * 1000000.0d);
    }

    public zzanf() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Layout.Alignment zzf(String str) {
        byte b2;
        String strZza = zzgql.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (strZza.equals(TtmlNode.CENTER)) {
                    b2 = 4;
                } else {
                    b2 = -1;
                }
                break;
            case 100571:
                if (strZza.equals(TtmlNode.END)) {
                    b2 = 3;
                    break;
                }
                break;
            case 3317767:
                if (strZza.equals(TtmlNode.LEFT)) {
                    b2 = 0;
                    break;
                }
                break;
            case 108511772:
                if (strZza.equals(TtmlNode.RIGHT)) {
                    b2 = 2;
                    break;
                }
                break;
            case 109757538:
                if (strZza.equals(TtmlNode.START)) {
                    b2 = 1;
                    break;
                }
                break;
        }
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2 && b2 != 3) {
                if (b2 != 4) {
                    return null;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i2, i3), zzameVar, zzdrVar);
    }
}
