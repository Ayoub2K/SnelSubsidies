<template>
  <transition name="modal-fade">
    <div class="modal-backdrop">
      <div class="modal">
        <header class="modal-header">
          <slot name="header">
            title
          </slot>
          <button
              type="button"
              class="btn-close"
              @click="close"
          >
            x
          </button>
        </header>

        <section class="modal-body">
          <slot name="body">
            body
          </slot>
        </section>

        <footer class="modal-footer">
          <button
              type="button"
              class="btn-green"
              @click="close"
          >
            Sluit details
          </button>
        </footer>
      </div>
    </div>
  </transition>
</template>

<script>
export default {
  name: 'ModalComponent',
  methods: {
    close() {
      this.$emit('close');
    },
  },
};
</script>

<style scoped>
.modal-fade-enter,
.modal-fade-leave-to {
  opacity: 0;
}

.modal-fade-enter-active,
.modal-fade-leave-active {
  transition: opacity .5s ease;
}

.modal-backdrop {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: rgba(0, 0, 0, 0.3);
  display: flex;
  justify-content: center;
  align-items: center;
}

.modal {
  background: #FFFFFF;
  box-shadow: 2px 2px 20px 1px;
  overflow-x: auto;
  display: flex;
  flex-direction: column;
}

.modal-header,
.modal-footer {
  padding: 15px;
  display: flex;
}

.modal-header {
  position: relative;
  border-bottom: 1px solid #eeeeee;
  color: #000000;
  justify-content: space-between;
}

.modal-footer {
  border-top: 1px solid #eeeeee;
  flex-direction: column;
  justify-content: flex-end;
}

.modal-body {
  color: black;
  position: relative;
  padding: 20px 10px;
}

.btn-close {
  position: absolute;
  top: 0;
  right: 0;
  border: none;
  font-size: 20px;
  padding: 10px;
  cursor: pointer;
  font-weight: bold;
  color: #463c95;
  background: transparent;
}

.btn-green {
  color: white;
  background: #463c95;
  border: 1px solid #463c95;
  border-radius: 2px;
}
</style>