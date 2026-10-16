# Fleet EMI = SEMI (since 2026-10-10)

Upstream: Pandaismyname1/SEMI branch `26.1` @ 151a6c88 (MIT) — continuation of EMI on the link-fgfgui 26.1 port,
includes upstream EMI up to 81f6453c (2026-08-17). Replaces our old port `forks/EMI` (work/26.1.2-native-emi,
4524a4bf = link-fgfgui @ cdf2a46f + JEMI removal + getRecipeLookupStack; now frozen, kept for reference).

Published as `dev.emi:emi-neoforge:1.1.24-semi<commit>+26.1.2` (forks pin `emi_version=1.1.24-semi151a6c88+26.1.2`).

Fleet changes on top of SEMI (originals of build files in `.fleet-orig/`):
- `settings.gradle`: rootProject.name `emi` (Maven artifact `emi-neoforge`; jar name stays `semi-*`).
- `build.gradle`: `-semi<commit>` instead of `-SNAPSHOT` in the version.
- `gradle.properties`: NeoForge 26.1.2.114.
- `EmiApi.getRecipeLookupStack()` + `RecipeScreen` lookup stack (from 4524a4bf) — used by Domum Ornamentum's
  Architect's Cutter EMI recipe.
- `EmiStackConvertible`: `@Environment(CLIENT)` dropped — the NeoForge build turns it into `@OnlyIn`, which FML 11
  reports on a loading warning screen (blocked quick-play in visual QA).
- `assets/emi/lang/ru_ru.json`: our pack localization merged (68 keys) + 2 new keys.
JEMI kept (inactive without JEI).
