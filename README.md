# 📱 Instagram Clone App

![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento%20%F0%9F%9D%A7-yellow.svg)
![Android CI](https://github.com/Domingosvana/Instagram/actions/workflows/android.yml/badge.svg)
![Kotlin](https://img.shields.io/badge/Kotlin-1.8.10-blue.svg)
![Android SDK](https://img.shields.io/badge/Android%20SDK-33-green.svg)

> 🚧 **Projeto em Desenvolvimento:** Este aplicativo está sendo construído progressivamente como parte das aulas do curso de Desenvolvimento Android. Novas funcionalidades, telas e testes são adicionados continuamente.

Um aplicativo Android moderno que recria a interface e as funcionalidades do **Instagram**, desenvolvido como parte do aprendizado prático de arquitetura e desenvolvimento Android no curso **Tiago Aguiar**.

---

## 🚀 Funcionalidades Principais

- 🔑 **Autenticação & Login:** Tela de login com monitoramento dinâmico dos campos (`TextWatcher`) e botão customizado com animação de carregamento (`LoadingButton`).
- 📝 **Fluxo de Cadastro em Etapas:**
  - Etapa 1: Digitação do e-mail (`RegisterEmailFragment`).
  - Etapa 2: Definição de nome de usuário e senha (`RegisternNamePasswordFragment`).
  - Etapa 3: Tela de boas-vindas (`RegisterWelcomeFragment`).
- 🧪 **Testes Unitários Automatizados:** Suíte de testes para validação de regras de e-mail e requisitos mínimos de senha (`LoginValidatorTest`).
- 🔄 **Esteira de CI/CD (GitHub Actions):** Automação que testa e compila o APK do aplicativo a cada atualização no código.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** [Kotlin 1.8.10](https://kotlinlang.org/)
- **Linguagem de Marcação:** XML (Android Layouts, Styles, Drawables)
- **Componentes de UI:** `Activity`, `Fragment`, `TextInputLayout`, `FrameLayout` (Custom View)
- **Testes Unitários:** JUnit 4
- **Automação & CI/CD:** GitHub Actions (Java 17 Temurin)
- **Build System:** Gradle (AGP 7.4.2)
- **SDK Mínimo:** Android 6.0 (API 23)
- **SDK Alvo:** Android 13 (API 33)

---

## 📂 Estrutura do Projeto

```text
app/src/main/java/co/tiagoaguiar/course/instagram/
│
├── login/
│   ├── LoginActivity.kt              # Tela principal de Login
│   └── LoadingButton.kt              # Componente visual customizado de botão
│
├── register/
│   └── view/
│       ├── RegisterActivity.kt       # Activity container do cadastro
│       ├── RegisterEmailFragment.kt  # Etapa 1: Digitação de E-mail
│       ├── RegisternNamePasswordFragment.kt # Etapa 2: Nome e Senha
│       ├── RegisterWelcomeFragment.kt# Etapa 3: Boas-vindas
│       └── RegisterPhotoFragment.kt  # Etapa 4: Adição de Foto de Perfil
│
└── util/
    └── LoginValidator.kt             # Lógica pura de validação (Testável)
```

---

## 🧪 Como Executar os Testes Unitários

Você pode executar a suíte de testes unitários localmente via linha de comando ou pelo Android Studio:

```bash
# Executar todos os testes unitários via Gradle Wrapper
./gradlew test
```

---

## 📲 Como Baixar o APK do Aplicativo

Graças à esteira de **CI/CD com GitHub Actions**, o APK compilado é gerado automaticamente em cada commit:

1. Acesse a aba **[Actions](https://github.com/Domingosvana/Instagram/actions)** no topo do repositório.
2. Clique na execução mais recente (com ícone verde **✔**).
3. Role até o final da página e baixe o arquivo **`app-debug-apk`** na seção **Artifacts**.

---

## ⚙️ Como Executar o Projeto Localmente

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Domingosvana/Instagram.git
   ```
2. **Abra o projeto no Android Studio** (versão Flamingo/Giraffe/Ladybug ou superior recomendada).
3. Agarde o Gradle sincronizar as dependências (`Gradle Sync`).
4. Execute o app em um dispositivo físico ou no Emulador Android (API 23+).

---

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais e de aprendizado.
