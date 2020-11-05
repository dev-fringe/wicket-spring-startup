import 'reset-css';
import '@src/index.css';
import {LitElement, html, customElement, css, unsafeCSS } from 'lit-element';

@customElement("app-index")
class index extends LitElement {
  static styles = css`
  `;
  render() {
      console.log(index.getStyles);
    return html`
      <div class="sideBadge">Hello from11 MyElement!</div>
	  <div id="header">sdd</div>
    `;
  }
}



