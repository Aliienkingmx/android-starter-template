# Contribuir / Contributing

¡Gracias por querer contribuir a este template! 🙌

## Flujo de trabajo / Workflow

1. Haz fork del repositorio y clona tu copia.
2. Crea una rama: `git checkout -b feat/nombre-de-la-mejora`
3. Haz tus cambios y verifica que todo pase:

```bash
./gradlew test
./gradlew assembleDebug
```

4. Abre un Pull Request contra `main` usando la plantilla.
5. Espera el review y el check de CI (`build`).

## Convenciones / Conventions

- Mensajes de commit en formato [Conventional Commits](https://www.conventionalcommits.org/) (ej. `feat:`, `fix:`, `docs:`).
- Código en Kotlin con estilo oficial (2 espacios de indentación).
- Documentación nueva en español e inglés.

## Tests

- Cada cambio debe incluir o actualizar tests unitarios y/o de UI.
- Verificación local: `./gradlew test`
