node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'melodic-devel'
    registerROS('ros:melodic-ros-base', [
        'libopenblas-dev',
        'ros-melodic-moveit-core',
        'ros-melodic-tf-conversions'
    ], [])
}
