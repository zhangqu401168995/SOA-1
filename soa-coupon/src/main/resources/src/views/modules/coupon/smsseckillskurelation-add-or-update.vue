<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="${column.comments}" prop="promotionId">
      <el-input v-model="dataForm.promotionId" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="promotionSessionId">
      <el-input v-model="dataForm.promotionSessionId" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="skuId">
      <el-input v-model="dataForm.skuId" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="seckillPrice">
      <el-input v-model="dataForm.seckillPrice" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="seckillCount">
      <el-input v-model="dataForm.seckillCount" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="seckillLimit">
      <el-input v-model="dataForm.seckillLimit" placeholder="${column.comments}"></el-input>
    </el-form-item>
    <el-form-item label="${column.comments}" prop="seckillSort">
      <el-input v-model="dataForm.seckillSort" placeholder="${column.comments}"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          promotionId: '',
          promotionSessionId: '',
          skuId: '',
          seckillPrice: '',
          seckillCount: '',
          seckillLimit: '',
          seckillSort: ''
        },
        dataRule: {
          promotionId: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          promotionSessionId: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          skuId: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          seckillPrice: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          seckillCount: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          seckillLimit: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ],
          seckillSort: [
            { required: true, message: '${column.comments}不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/coupon/smsseckillskurelation/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.promotionId = data.smsSeckillSkuRelation.promotionId
                this.dataForm.promotionSessionId = data.smsSeckillSkuRelation.promotionSessionId
                this.dataForm.skuId = data.smsSeckillSkuRelation.skuId
                this.dataForm.seckillPrice = data.smsSeckillSkuRelation.seckillPrice
                this.dataForm.seckillCount = data.smsSeckillSkuRelation.seckillCount
                this.dataForm.seckillLimit = data.smsSeckillSkuRelation.seckillLimit
                this.dataForm.seckillSort = data.smsSeckillSkuRelation.seckillSort
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/coupon/smsseckillskurelation/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'promotionId': this.dataForm.promotionId,
                'promotionSessionId': this.dataForm.promotionSessionId,
                'skuId': this.dataForm.skuId,
                'seckillPrice': this.dataForm.seckillPrice,
                'seckillCount': this.dataForm.seckillCount,
                'seckillLimit': this.dataForm.seckillLimit,
                'seckillSort': this.dataForm.seckillSort
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
