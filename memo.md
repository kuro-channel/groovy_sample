## Gradleセットアップ
- Gradleのインストール
https://gradle.org/

## Controller
### @RestController
- アプリケーション全体の処理をコントロールする役目を果たす
  - アプリケーションにアクセスした時の処理をコントローラーに用意しておけば、アプリケーションとして機能するようになる。

### @Controller
- テンプレートを利用して、HTMLページをレンダリングし、表示する
  - テンプレートを使用してHTMLをレンダリングし、表示する場合等に使用

### @RequestMapping
- このアドレスにアクセスしたら、このメソッドを実行する
  - `@RequestMapping(value=アドレス, method=メソッド)`

### @RequestParam
- フォームから送信された値
  - **フォームから送られてきた値は@RequestParamアノテーションを付けた引数に自動的に渡される**

### @ResponseBody
- レスポンスをオブジェクトで設定する
  - `ModelAndView`：ModelとViewをまとめて管理
  - ` mav.setViewName("home")`：

### Thymeleaf
- `th:XX`, `th:text`：独自属性の値がタグの値に置き換えられてレンダリングされる
- `th:value="${value}"`：value属性をレンダリングの際に上書きする
