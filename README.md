# 📱 Android Starter Template

> Template de repositorio Android "todo incluido": Kotlin + Jetpack Compose
> con CI/CD, releases automáticas, Dependabot y documentación profesional.
>
> _"All-in-one" Android repository template: Kotlin + Jetpack Compose with
> CI/CD, automated releases, Dependabot and professional documentation._

[![Build](https://github.com/Aliienkingmx/android-starter-template/actions/workflows/build.yml/badge.svg)](https://github.com/Aliienkingmx/android-starter-template/actions/workflows/build.yml)
[![Release](https://img.shields.io/github/v/release/Aliienkingmx/android-starter-template)](https://github.com/Aliienkingmx/android-starter-template/releases)
[![Downloads](https://img.shields.io/github/downloads/Aliienkingmx/android-starter-template/total)](https://github.com/Aliienkingmx/android-starter-template/releases)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

---

## ✨ Funcionalidades / Features

- **App base mínima** en Kotlin + Jetpack Compose (Material 3): pantalla contador.
- **CI/CD listo**: al pushear un tag `v*` se compila, corre tests y publica un APK firmado en Releases.
- **Dependabot**: actualizaciones semanales de Gradle y GitHub Actions.
- **Plantillas** de issues y PR bilingües.
- **Documentación** completa: README, CONTRIBUTING, SECURITY, CHANGELOG.

## 🚀 Cómo usar este template / How to use this template

1. **Crea un repo desde este template** en GitHub (botón *Use this template*).
2. **Clona** tu nuevo repo:

```bash
git clone https://github.com/TU_USUARIO/TU_REPO.git
cd TU_REPO
```

3. **Renombra el paquete** `com.example.app` por el tuyo
   (`app/build.gradle.kts` → `namespace` y `applicationId`, y mueve los archivos de `app/src/main/java/`).
4. Cambia el `app_name` en `app/src/main/res/values/strings.xml`.
5. Compila: `./gradlew assembleDebug`
6. Para publicar una release, crea un tag:

```bash
git tag v0.1.0
git push origin v0.1.0
```

El CI publicará `AndroidStarter-v0.1.0.apk` en Releases automáticamente.

## 🧪 Verificación local / Local verification

```bash
./gradlew test
./gradlew assembleDebug
```

## 🗂️ Estructura / Project structure

```text
app/src/main/
├── AndroidManifest.xml        # Manifiesto
├── java/com/example/app/
│   ├── MainActivity.kt        # Entry point
│   ├── ui/counter/            # Lógica y pantalla del contador
│   │   ├── Counter.kt         # Lógica pura (testeable en JVM)
│   │   └── CounterScreen.kt   # UI Compose
│   └── ui/theme/              # Tema Material 3
└── res/
    ├── values/                # Strings, temas
    ├── xml/                   # Reglas de backup/extracción
    └── mipmap/                # Iconos
.github/
├── workflows/build.yml        # CI/CD
├── dependabot.yml             # Dependabot
├── CODEOWNERS                 # Responsables por defecto
├── ISSUE_TEMPLATE/            # Plantillas de issues
└── PULL_REQUEST_TEMPLATE.md   # Plantilla de PR
```

## ⚙️ Personalización antes de publicar / Customize before shipping

Este template ya funciona tal cual, pero **antes de usarlo en producción** revisa:

| Archivo | Acción |
|---|---|
| `app/build.gradle.kts` | Renombra `namespace` / `applicationId` y el paquete `com.example.app`. Actualiza `versionName` (o pásalo como `-PversionName=x.y.z` en CI). |
| `app/src/main/res/values/strings.xml` | Cambia `app_name`. |
| `README.md` badges | Apuntan a `Aliienkingmx/android-starter-template`; actualízalos a tu repo. |
| `.github/CODEOWNERS` | Sustituye `@Aliienkingmx` por tus responsables. |
| `LICENSE` | Sustituye el titular del copyright. |
| `settings.gradle.kts` | Actualiza `rootProject.name`. |

> **Nota sobre el APK publicado**: el CI publica el **APK de debug** firmado con el
> keystore de debug generado en cada run. Es suficiente para pruebas y demos; para
> distribución en Play Store configura un keystore de producción (ver `app/build.gradle.kts`).

## 🛠️ Stack / Tech stack

| Tecnología | Versión |
|---|---|
| Kotlin | 2.2.10 |
| Jetpack Compose (Material 3) | BOM 2024.09.00 |
| AGP | 9.1.1 |
| Gradle | 9.3.1 |
| minSdk / targetSdk / compileSdk | 24 / 36 / 36 |

## 📄 Licencia / License

[MIT](LICENSE)
